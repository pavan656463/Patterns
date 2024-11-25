package SOLID.Open_Close_Principle.solution;


public class Ticket {
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

