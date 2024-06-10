package SOLID.Liskov;

import java.io.FileWriter;
import java.io.IOException;

// Interface for file operations
interface FileOperations {
    void saveToFile(Ticket ticket);
}

// Base class that handles basic file operations
class BasicFileOperations implements FileOperations {
    @Override
    public void saveToFile(Ticket ticket) {
        System.out.println("Saving basic ticket details to file...");
        // Basic implementation to save ticket details to a file
    }
}

// Extended class that handles additional file operations
class ExtendedFileOperations implements FileOperations {
    @Override
    public void saveToFile(Ticket ticket) {
        try (FileWriter writer = new FileWriter("C:\\Users\\pavan.k\\Desktop\\TICKET.txt")) {
            writer.write("Passenger Name: " + ticket.getPassengerName() + "\n");
            writer.write("Flight Number: " + ticket.getFlightNumber() + "\n");
            System.out.println("Saving extended ticket details to file...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Class that handles ticket operations
class TicketOperations {
    private FileOperations fileOperations;

    public TicketOperations(FileOperations fileOperations) {
        this.fileOperations = fileOperations;
    }

    public void saveTicketToFile(Ticket ticket) {
        fileOperations.saveToFile(ticket);
    }
}

// Ticket class
class Ticket {
    private String passengerName;
    private String flightNumber;

    public Ticket(String passengerName, String flightNumber) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        // Create a Ticket object
        Ticket ticket = new Ticket("Pavan", "AA2025");

        // Use ExtendedFileOperations to save the ticket details to a file
        TicketOperations ticketOperations = new TicketOperations(new ExtendedFileOperations());
        ticketOperations.saveTicketToFile(ticket);

        // Output confirmation
        System.out.println("Ticket details saved to file.");
    }
}
