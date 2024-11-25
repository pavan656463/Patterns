// Main.java
import java.util.Scanner;

public class Maindemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Book", 500);
        Item item2 = new Item("Pen", 50);

        cart.addItem(item1);
        cart.addItem(item2);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.print("Enter choice: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        PaymentStrategy paymentStrategy = null;

        switch (choice) {
            case 1:
                System.out.print("Enter Card Number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter Card Holder Name: ");
                String cardHolderName = scanner.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = scanner.nextLine();
                System.out.print("Enter Expiration Date (MM/YY): ");
                String expirationDate = scanner.nextLine();
                paymentStrategy = new CreditCardPayment(cardNumber, cardHolderName, cvv, expirationDate);
                break;
            case 2:
                System.out.print("Enter PayPal Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter PayPal Password: ");
                String password = scanner.nextLine();
                paymentStrategy = new PayPalPayment(email, password);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        cart.pay(paymentStrategy);
    }
}
