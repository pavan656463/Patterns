package SOLID.Dependency_Inversion_Principle;

// Interface for message services
public interface MessageService {
    void sendMessage(String message, String recipient);
}
