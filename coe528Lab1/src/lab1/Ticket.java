package lab1;

/**
 *
 * @author ivan wang 501086429
 */
public class Ticket {

    //initialize instance variables
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int number = 0;

    /**
     * passenger constructor
     *
     * @param p
     * @param flight
     * @param price
     */
    public Ticket(Passenger p, Flight flight, double price) {
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        this.number += 1;
    }

    /**
     * getter
     *
     * @return name of passenger
     */
    public Passenger getPassenger() {
        return this.passenger;
    }

    /**
     * getter
     *
     * @return flight details
     */
    public Flight getFlight() {
        return this.flight;
    }

    /**
     * getter
     *
     * @return price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * getter
     *
     * @return ticket number
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * setter
     *
     * @param p
     */
    public void setPassenger(Passenger p) {
        this.passenger = p;
    }

    /**
     * setter
     *
     * @param flight
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * setter
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * setter
     *
     * @param number
     */
    public static void setNumber(int number) {
        Ticket.number = number;
    }

    /**
     * Override toString
     *
     * @return string representation of ticket details
     */
    @Override
    public String toString() {
        return (passenger.getName() + ", " + "Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + " to " + flight.getDestination()
                + ", " + flight.getDepartureTime() + ", " + "original price: $" + flight.getOriginalPrice() + ", ticket price: $" + this.price);
    }
}
