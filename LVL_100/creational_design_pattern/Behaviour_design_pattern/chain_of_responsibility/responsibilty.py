# Define an abstract handler class
class CallHandler:
    def __init__(self, next_handler=None):
        self.next_handler = next_handler

    def handle_call(self, request):
        pass

# Concrete handlers
class CustomerSupport(CallHandler):
    def handle_call(self, request):
        if request == "Product inquiry":
            print("Customer support: Let me check the product details for you.")
            return True
        else:
            return self.next_handler.handle_call(request) if self.next_handler else False

class OrderProcessing(CallHandler):
    def handle_call(self, request):
        if request == "Order status":
            print("Order processing: Your order is on the way.")
            return True
        else:
            return self.next_handler.handle_call(request) if self.next_handler else False

class PaymentSupport(CallHandler):
    def handle_call(self, request):
        if request == "Payment issue":
            print("Payment support: Let me assist you with your payment issue.")
            return True
        else:
            return self.next_handler.handle_call(request) if self.next_handler else False

# Client code
def main():
    # Construct the chain
    customer_support = CustomerSupport()
    order_processing = OrderProcessing()
    payment_support = PaymentSupport()

    customer_support.next_handler = order_processing
    order_processing.next_handler = payment_support

    # Simulate incoming calls
    calls = ["Product inquiry", "Order status", "Payment issue", "Returns"]
    for call in calls:
        handled = customer_support.handle_call(call)
        if not handled:
            print("Sorry, we couldn't handle your request.")

if __name__ == "__main__":
    main()
