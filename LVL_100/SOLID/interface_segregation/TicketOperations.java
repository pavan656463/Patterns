package SOLID.interface_segregation;


public class TicketOperations {
    private FileOperations fileOperations;

    public TicketOperations(FileOperations fileOperations) {
        this.fileOperations = fileOperations;
    }

    public void saveTicketToFile(Ticket ticket) {
        fileOperations.saveToFile(ticket);
    }
}
