package SOLID.Dependency_Inversion_Principle;

// High-level module for sending notifications
public class Notification {
    private final MessageService messageService;

    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}
