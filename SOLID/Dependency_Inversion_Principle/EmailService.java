package SOLID.Dependency_Inversion_Principle;

// Class that implements email message service
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Email sent to " + recipient + " with message: " + message);
    }
}
