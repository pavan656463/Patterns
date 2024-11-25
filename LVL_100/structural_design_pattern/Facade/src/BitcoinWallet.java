package structural_design_pattern.Facade.src;

public class BitcoinWallet {
    private static BitcoinWallet instance;
    private double balance;

    private BitcoinWallet() {
        this.balance = 0;
    }

    public static BitcoinWallet getInstance() {
        if (instance == null) {
            instance = new BitcoinWallet();
        }
        return instance;
    }

    public double getBalance() {
        return balance;
    }

    public void addCoins(double amount) {
        this.balance += amount;
    }

    public void removeCoins(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient BTC balance");
        } else {
            this.balance -= amount;
            System.out.println("Removed " + amount + " BTC from wallet. New balance: " + this.balance);
        }
    }
}

