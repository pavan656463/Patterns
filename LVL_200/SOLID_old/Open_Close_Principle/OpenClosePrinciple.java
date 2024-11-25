package SOLID.Open_Close_Principle;

import java.io.FileWriter;
import java.io.IOException;

import SOLID.Open_Close_Principle.FileOperations;

// Class that represents a ticket
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

// Interface for file operations
interface FileOperations {
    void saveToFile(Ticket ticket);
}

// Class that handles file operations
class TicketFileOperations implements FileOperations {
    @Override
    public void saveToFile(Ticket ticket) {
        try (FileWriter writer = new FileWriter("C:\\Users\\pavan.k\\Desktop\\TICKET.txt")) {
            writer.write("Passenger Name: " + ticket.getPassengerName() + "\n");
            writer.write("Flight Number: " + ticket.getFlightNumber() + "\n");
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

public class OpenClosePrinciple {
    public static void main(String[] args) {
        // Create a Ticket object and save its details to a file
        Ticket ticket = new Ticket("Pavan", "AA2024");

        // Use TicketOperations to save the ticket details to a file
        TicketOperations ticketOperations = new TicketOperations(new TicketFileOperations());
        ticketOperations.saveTicketToFile(ticket);

        // Output confirmation
        System.out.println("Ticket details saved to file.");
    }
}
