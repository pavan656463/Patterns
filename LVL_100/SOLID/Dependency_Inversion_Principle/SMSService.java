package SOLID.Dependency_Inversion_Principle;

// Class that implements SMS message service
public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("SMS sent to " + recipient + " with message: " + message);
    }
}
