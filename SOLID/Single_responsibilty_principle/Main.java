import java.io.FileWriter;
import java.io.IOException;
// Without SRP 
// Class that handles ticket information and file operations
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

    // Method to save ticket details to a file
    public void saveToFile() {
        try (FileWriter writer = new FileWriter("C:\\Users\\pavan.k\\Desktop\\TICKET.txt")) {
            writer.write("Passenger Name: " + this.getPassengerName() + "\n");
            writer.write("Flight Number: " + this.getFlightNumber() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Ticket object and save its details to a file
        Ticket ticket = new Ticket("Pavan", "AI2024");
        ticket.saveToFile();

        // Output confirmation
        System.out.println("Ticket details saved to file.");
    }
}
