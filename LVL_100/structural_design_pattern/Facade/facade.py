class BitcoinWallet:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super().__new__(cls)
            cls._instance.balance = 0
        return cls._instance

    def __init__(self):
        pass


class EthereumWallet:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super().__new__(cls)
            cls._instance.balance = 0
        return cls._instance

    def __init__(self):
        pass


class CryptoFacade:
    def __init__(self):
        self.bitcoin_wallet = BitcoinWallet()
        self.ethereum_wallet = EthereumWallet()

    def add_coins(self, amount, currency):
        if currency == "btc":
            self.bitcoin_wallet.balance += amount
        elif currency == "eth":
            self.ethereum_wallet.balance += amount
        else:
            print("Unsupported currency")

    def remove_coins(self, amount, currency):
        if currency == "btc":
            if amount > self.bitcoin_wallet.balance:
                print("Insufficient BTC balance")
            else:
                self.bitcoin_wallet.balance -= amount
                print(f"Removed {amount} BTC from wallet. New balance: {self.bitcoin_wallet.balance}")
        elif currency == "eth":
            if amount > self.ethereum_wallet.balance:
                print("Insufficient ETH balance")
            else:
                self.ethereum_wallet.balance -= amount
                print(f"Removed {amount} ETH from wallet. New balance: {self.ethereum_wallet.balance}")
        else:
            print("Unsupported currency")

    def get_balance(self, currency):
        if currency == "btc":
            print(f"Your BTC balance is: {self.bitcoin_wallet.balance}")
        elif currency == "eth":
            print(f"Your ETH balance is: {self.ethereum_wallet.balance}")
        else:
            print("Unsupported currency")


# Example usage
if __name__ == "__main__":
    facade = CryptoFacade()
    amount = 10
    currency = "btc"  # or "eth"

    # Adding coins
    facade.add_coins(amount, currency)
    # Checking balance
    facade.get_balance(currency)

    amount = 5
    facade.add_coins(amount, currency)
    facade.get_balance(currency)

    # Removing coins
    facade.remove_coins(50, currency)



