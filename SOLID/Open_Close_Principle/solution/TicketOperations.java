package SOLID.Open_Close_Principle.solution;

// TicketOperations.java

public class TicketOperations {
    private FileOperations fileOperations;

    public TicketOperations(FileOperations fileOperations) {
        this.fileOperations = fileOperations;
    }

    public void saveTicketToFile(Ticket ticket) {
        fileOperations.saveToFile(ticket);
    }
}
