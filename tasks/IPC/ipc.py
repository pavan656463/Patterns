import multiprocessing
import time
import random
import signal
import logging
import sys

# Configure logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s [%(levelname)s] %(message)s')

# Global flag to indicate if processes should continue running
running = multiprocessing.Event()
running.set()

# Function for seller process
def seller(market_queue, seller_id, remaining_products):
    while running.is_set() and remaining_products.value > 0:
        with remaining_products.get_lock():
            if remaining_products.value <= 0:
                break
            remaining_products.value -= 1
            product_id = remaining_products.value
        product = f"Product-{seller_id}-{product_id}"
        logging.info(f"Seller-{seller_id} produced {product}")
        market_queue.put(product)
        time.sleep(random.uniform(0.5, 2.0))

# Function for buyer process
def buyer(market_queue, buyer_id):
    while running.is_set():
        try:
            product = market_queue.get(timeout=1)
            logging.info(f"Buyer-{buyer_id} bought {product}")
            time.sleep(random.uniform(0.5, 2.0))
        except:
            continue

def start_processes(market_queue, num_sellers, num_buyers, remaining_products):
    processes = []

    for i in range(num_sellers):
        p = multiprocessing.Process(target=seller, args=(market_queue, i + 1, remaining_products))
        processes.append(p)
        p.start()

    for i in range(num_buyers):
        p = multiprocessing.Process(target=buyer, args=(market_queue, i + 1))
        processes.append(p)
        p.start()

    return processes

def stop_processes(processes):
    running.clear()
    for p in processes:
        p.terminate()
        p.join()

def signal_handler(signal, frame):
    logging.info('Received signal to stop. Terminating processes...')
    stop_processes(processes)
    sys.exit(0)

if __name__ == "__main__":
    logging.info("Starting the Market Simulation...")

    # Set up signal handlers
    signal.signal(signal.SIGINT, signal_handler)
    signal.signal(signal.SIGTERM, signal_handler)

    # Create a queue for the market
    market_queue = multiprocessing.Queue()

    # Number of sellers and buyers
    num_sellers = 3
    num_buyers = 4

    # Total number of products to be produced
    total_products = 10
    remaining_products = multiprocessing.Value('i', total_products)

    # Start the seller and buyer processes
    processes = start_processes(market_queue, num_sellers, num_buyers, remaining_products)
    logging.info("All seller and buyer processes are running. Press Ctrl+C to stop.")

    try:
        while True:
            time.sleep(1)
            if remaining_products.value <= 0 and market_queue.empty():
                logging.info("No more products left to produce. Closing the shop.")
                stop_processes(processes)
                break
    except KeyboardInterrupt:
        signal_handler(None, None)
