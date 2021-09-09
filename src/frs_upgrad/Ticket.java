package frs_upgrad;

public class Ticket {
    private static int idCounter;
    private int id;
    private int pnrNumber;
    private String departure;
    private String destination;
    private String dateOfDeparture;
    private String dateOfArrival;
    private String timeOfDeparture;
    private String timeOfArrival;
    private float price;
    private String seatNumber;
    private boolean isCancelled;
    private Passenger passenger;
    private Flight flight;

    static {
        idCounter = 0;
    }

    //constructor
    public Ticket(int pnrNumber, String departure, String destination,
                  String dateOfDeparture, String dateOfArrival,
                  String timeOfDeparture, String timeOfArrival, float price,
                  String seatNumber, boolean isCancelled, Passenger passenger, Flight flight) {
        this.id = ++idCounter;
        this.pnrNumber = pnrNumber;
        this.departure = departure;
        this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
        this.price = price;
        this.seatNumber = seatNumber;
        this.isCancelled = isCancelled;
        this.passenger = passenger;
        this.flight = flight;

    }

    //getters and setters
    public int getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(int pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

}
