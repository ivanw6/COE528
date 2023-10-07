package lab1;

/**
 *
 * @author ivan wang 501086429
 */
public class Flight {

    //intialize instance variables
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    /**
     * flight constructor
     *
     * @param flightNumber
     * @param origin
     * @param destination
     * @param departureTime
     * @param capacity
     * @param originalPrice
     * @throws IllegalArgumentException
     */
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) throws IllegalArgumentException {
        if (origin.equals(destination)) {
            throw new IllegalArgumentException("origin and destination cannot be same!");
        }
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft = capacity;
        this.originalPrice = originalPrice;
    }

    /**
     * getter
     *
     * @return flight number
     */
    public int getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * getter
     *
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * getter
     *
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * getter
     *
     * @return departure time
     */
    public String getDepartureTime() {
        return this.departureTime;
    }

    /**
     * getter
     *
     * @return capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * getter
     *
     * @return number of seats left
     */
    public int getNumberOfSeatsLeft() {
        return this.numberOfSeatsLeft;
    }

    /**
     * getter
     *
     * @return original price
     */
    public double getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * setter
     *
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * setter
     *
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * setter
     *
     * @param departureTime
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * setter
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * setter
     *
     * @param numberOfSeatsLeft
     */
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    /**
     * setter
     *
     * @param originalPrice
     */
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * Checks whether there are available seats
     *
     * @return true if there are seats available, false otherwise.
     */
    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft -= 1;
            return true;
        } else {
            return false;
        }
    }

    /**
     * toString override
     *
     * @return String representation of flight details
     */
    @Override
    public String toString() {
        return ("Flight " + this.flightNumber + ", " + this.origin + " to " + this.destination
                + ", " + this.departureTime + ", " + "original price: $" + this.originalPrice);
    }
}
