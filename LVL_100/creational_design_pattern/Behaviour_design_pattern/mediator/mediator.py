class Mediator:
    def __init__(self):
        self.buyers = []
        self.sellers = []

    def register_buyer(self, buyer):
        self.buyers.append(buyer)

    def register_seller(self, seller):
        self.sellers.append(seller)

    def find_buyer(self, buyer_name):
        for b in self.buyers:
            if b.name == buyer_name:
                return b
        return None

    def find_seller(self, seller_name):
        for s in self.sellers:
            if s.name == seller_name:
                return s
        return None

    def match_buyer_with_seller(self, buyer_name, seller_name):
        buyer = self.find_buyer(buyer_name)
        seller = self.find_seller(seller_name)
        if buyer and seller:
            print(f"{buyer_name} is interested in buying a house from {seller_name}")
        else:
            print("No suitable match found.")

class Buyer:
    def __init__(self, name, mediator):
        self.name = name
        self.mediator = mediator
        self.mediator.register_buyer(self)

    def find_house(self, seller_name):
        self.mediator.match_buyer_with_seller(self.name, seller_name)

class Seller:
    def __init__(self, name, mediator):
        self.name = name
        self.mediator = mediator
        self.mediator.register_seller(self)

    def sell_house(self, buyer_name):
        self.mediator.match_buyer_with_seller(buyer_name, self.name)

if __name__ == "__main__":
    mediator = Mediator()

    buyer1 = Buyer("Pavan", mediator)
    buyer2 = Buyer("Ram", mediator)

    seller1 = Seller("Nithin", mediator)
    seller2 = Seller("Subbu", mediator)

    buyer1.find_house("Nithin")  # Buyer 1 is looking for a house from Seller 1
    seller1.sell_house("Pavan")  # Seller 1 sells a house to Buyer 1

    buyer2.find_house("Subbu")  # Buyer 2 is looking for a house from Seller 2
    seller2.sell_house("Ram")  # Seller 2 sells a house to Buyer 2
