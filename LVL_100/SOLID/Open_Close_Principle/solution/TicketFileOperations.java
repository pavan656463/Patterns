package SOLID.Open_Close_Principle.solution;


import java.io.FileWriter;
import java.io.IOException;

public class TicketFileOperations implements FileOperations {
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

