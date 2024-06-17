package structural_design_pattern.Facade.src;

public class EthereumWallet {
    private static EthereumWallet instance;
    private double balance;

    private EthereumWallet() {
        this.balance = 0;
    }

    public static EthereumWallet getInstance() {
        if (instance == null) {
            instance = new EthereumWallet();
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
            System.out.println("Insufficient ETH balance");
        } else {
            this.balance -= amount;
            System.out.println("Removed " + amount + " ETH from wallet. New balance: " + this.balance);
        }
    }
}
