package structural_design_pattern.Facade.src;

public class Main {
    public static void main(String[] args) {
        CryptoFacade wallet = new CryptoFacade();
        double amount = 10;
        String currency = "btc";  // or "eth"

        // Adding coins
        wallet.addCoins(amount, currency);
        // Checking balance
        wallet.getBalance(currency);

        amount = 5;
        wallet.addCoins(amount, currency);
        wallet.getBalance(currency);

        // Removing coins
        wallet.removeCoins(50, currency);
        CryptoFacade wallet2 = new CryptoFacade();
        amount = 10 ;
        wallet2.addCoins(amount, currency);
        wallet2.getBalance(currency);
        
    }
}

