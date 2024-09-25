public class SRP {
    public static void main(String[] args) {
        // Create a Ticket object and save its details to a file
        Ticket ticket = new Ticket("Pavan", "AA2024");

        TicketFileOperations fileOps = new TicketFileOperations();

        fileOps.saveToFile(ticket);

        // Output confirmation
        System.out.println("Ticket details saved to file.");
    }
}
