package SOLID.interface_segregation;


public class Interface_s{
    public static void main(String[] args) {
        // Create a Ticket object and save its details to a file
        Ticket ticket = new Ticket("Pavan", "AA2030");

        // Use TicketOperations to save the ticket details to a file
        TicketOperations ticketOperations = new TicketOperations(new TicketFileOperations());
        ticketOperations.saveTicketToFile(ticket);

        // Output confirmation
        System.out.println("Ticket details saved to file.");
    }
}

