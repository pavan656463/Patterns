package structural_design_pattern.Facade.src;

public class CryptoFacade {
    private BitcoinWallet bitcoinWallet;
    private EthereumWallet ethereumWallet;

    public CryptoFacade() {
        this.bitcoinWallet = BitcoinWallet.getInstance();
        this.ethereumWallet = EthereumWallet.getInstance();
    }

    public void addCoins(double amount, String currency) {
        if ("btc".equalsIgnoreCase(currency)) {
            bitcoinWallet.addCoins(amount);
        } else if ("eth".equalsIgnoreCase(currency)) {
            ethereumWallet.addCoins(amount);
        } else {
            System.out.println("Unsupported currency");
        }
    }

    public void removeCoins(double amount, String currency) {
        if ("btc".equalsIgnoreCase(currency)) {
            bitcoinWallet.removeCoins(amount);
        } else if ("eth".equalsIgnoreCase(currency)) {
            ethereumWallet.removeCoins(amount);
        } else {
            System.out.println("Unsupported currency");
        }
    }

    public void getBalance(String currency) {
        if ("btc".equalsIgnoreCase(currency)) {
            System.out.println("Your BTC balance is: " + bitcoinWallet.getBalance());
        } else if ("eth".equalsIgnoreCase(currency)) {
            System.out.println("Your ETH balance is: " + ethereumWallet.getBalance());
        } else {
            System.out.println("Unsupported currency");
        }
    }
}

