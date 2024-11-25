# Market Simulation

## Description

This project simulates a market where sellers produce products and buyers purchase them. The simulation uses Inter-Process Communication (IPC) with Python's `multiprocessing` module to manage multiple seller and buyer processes. The simulation ends when all products are produced and bought, ensuring the shop closes gracefully.

## How It Works

- **Sellers** produce products and put them into a shared queue.
- **Buyers** take products from the queue and log their purchases.
- The simulation terminates when all products are produced and bought, and processes are stopped.

## Key Components

1. **Logging Configuration**:
   - Configures logging to provide timestamps and log levels for better tracking of events.

2. **Global Flag**:
   - Uses a multiprocessing event `running` to manage the state of the processes.

3. **Seller Process**:
   - Produces products and puts them into the queue.
   - Stops producing when the total product limit is reached.

4. **Buyer Process**:
   - Buys products from the queue and logs the purchase.
   - Continues to check for products as long as the global flag `running` is set.

5. **Start Processes**:
   - Initializes and starts the seller and buyer processes.

6. **Stop Processes**:
   - Terminates all processes and ensures they join back properly.

7. **Signal Handler**:
   - Handles termination signals (e.g., Ctrl+C) to stop the processes gracefully.

## Changes Made

1. **Syntax Fix**:
   - Corrected the argument structure for `multiprocessing.Process`. Each `target` and `args` pair must be enclosed correctly.

2. **Buyer Logging**:
   - Ensured that each buyer logs the product they purchase.

3. **Termination Check**:
   - Added a check within the main loop to terminate processes when no more products are left to produce and the market queue is empty.

## Example output 
```
2024-06-05 20:07:34,595 [INFO] Starting the Market Simulation...
2024-06-05 20:07:34,896 [INFO] Seller-1 produced Product-1-9
2024-06-05 20:07:34,944 [INFO] Seller-2 produced Product-2-8
2024-06-05 20:07:34,977 [INFO] Seller-3 produced Product-3-7
2024-06-05 20:07:35,791 [INFO] Buyer-1 bought Product-1-9
2024-06-05 20:07:35,859 [INFO] Buyer-2 bought Product-2-8
2024-06-05 20:07:36,133 [INFO] Buyer-3 bought Product-3-7
...
2024-06-05 20:07:40,000 [INFO] No more products left to produce. Closing the shop.
```
