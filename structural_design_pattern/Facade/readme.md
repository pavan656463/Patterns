# Cryptocurrency Wallet Facade

This Python program demonstrates the use of the Facade design pattern to manage cryptocurrency wallets for Bitcoin (BTC) and Ethereum (ETH).

## What is a Facade?

In software engineering, the Facade pattern is a structural design pattern that provides a simplified interface to a complex system, making it easier to use. It hides the complexities of the system and provides a unified interface to interact with it.

## Program Overview

### Classes

- `BitcoinWallet`: Represents a Bitcoin wallet with a balance.
- `EthereumWallet`: Represents an Ethereum wallet with a balance.
- `CryptoFacade`: Acts as a simplified interface to manage cryptocurrency wallets.

### Features

- **Add Coins**: Allows adding coins to Bitcoin or Ethereum wallets.
- **Remove Coins**: Allows removing coins from Bitcoin or Ethereum wallets.

## How to Use

1. Clone this repository to your local machine.
2. Run the program using Python 3.
3. Follow the prompts to add and remove coins from the wallets.

## Example Usage

```python
if __name__ == "__main__":
    facade = CryptoFacade()
    amount = 125
    currency = "btc"  # or "eth"
    
    # Adding coins
    facade.add_coins(amount, currency)
    
    # Removing coins
    facade.remove_coins(50, currency)
