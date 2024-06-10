package SOLID.Dependency_Inversion_Principle;

public class DependencyInversionPrincipleExample {
    public static void main(String[] args) {
        // Using EmailService to send a notification
        MessageService emailService = new EmailService();
        Notification emailNotification = new Notification(emailService);
        emailNotification.notifyUser("Hello via Email!", "email@example.com");

        // Using SMSService to send a notification
        MessageService smsService = new SMSService();
        Notification smsNotification = new Notification(smsService);
        smsNotification.notifyUser("Hello via SMS!", "123-456-7890");
    }
}
