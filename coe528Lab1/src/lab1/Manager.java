package lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivan wang 501086429
 */
public class Manager {

    //initialize instance variables
    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);
    Scanner inputDbl = new Scanner(System.in);

    /**
     * Manager Constructor
     */
    public Manager() {
    }

    /**
     * createFlights method
     */
    public void createFlights() {
        System.out.println("Enter information about flight:");
        System.out.println("Flight Number:");
        int flightNumber = inputInt.nextInt();
        System.out.println("Origin:");
        String origin = inputStr.nextLine();
        System.out.println("Destination:");
        String destination = inputStr.nextLine();
        System.out.println("Departure Time:");
        String departureTime = inputStr.nextLine();
        System.out.println("Capacity:");
        int capacity = inputInt.nextInt();
        System.out.println("Price:");
        double price = inputInt.nextDouble();

        Flight flight = new Flight(flightNumber, origin, destination, departureTime, capacity, price);
        flights.add(flight);
        System.out.println("The following flight has been added:");
        System.out.println(flight);
    }

    /**
     * displayAvailableFlights method
     *
     * @param origin
     * @param destination
     */
    public void displayAvailableFlights(String origin, String destination) {
        for (Flight flight : flights) {
            if (flight.getOrigin().equalsIgnoreCase(origin) && flight.getDestination().equalsIgnoreCase(destination)) {
                if (flight.getNumberOfSeatsLeft() > 0) {
                    System.out.println(flight);
                }
            }
        }
    }

    /**
     * getFlight method
     *
     * @param flightNumber
     * @return flight
     */
    public Flight getFlight(int flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }

    /**
     * bookSeat Method
     *
     * @param flightNumber
     * @param p
     */
    public void bookSeat(int flightNumber, Passenger p) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                if (flight.bookASeat()) {
                    Ticket ticket = new Ticket(p, flight, p.applyDiscount(flight.getOriginalPrice()));
                    tickets.add(ticket);
                    System.out.println(ticket);
                }
            }
        }
    }

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        boolean end = false;

        while (end != true) {
            System.out.println("Enter 'a' to create a flight");
            System.out.println("Enter 'b' to display available flights");
            System.out.println("Enter 'c' to get information of a flight");
            System.out.println("Enter 'd' to book a seat");
            System.out.println("Enter 'e' to end the program");
            String choice = input1.nextLine();
            switch (choice) {
                case "a":
                    manager.createFlights();
                    System.out.println("");
                    break;
                case "b":
                    System.out.println("Enter origin:");
                    String origin = input1.nextLine();
                    System.out.println("Enter destination:");
                    String destination = input1.nextLine();
                    System.out.println("Flights available for " + origin + " to " + destination);
                    manager.displayAvailableFlights(origin, destination);
                    System.out.println("");
                    break;
                case "c":
                    System.out.println("Enter flight number:");
                    int flightNumber = input2.nextInt();
                    Flight flight = manager.getFlight(flightNumber);
                    if (flight == null) {
                        System.out.println("Flight " + flightNumber + " does not exist");
                        System.out.println("");
                    } else {
                        System.out.println("Information on flight " + flightNumber + ":");
                        System.out.println(flight);
                        System.out.println("");
                    }
                    break;
                case "d":
                    System.out.println("Do you have a membership? (y or n)");
                    String member = input1.nextLine();
                    System.out.println("Enter your name:");
                    String name = input1.nextLine();
                    System.out.println("Enter your age:");
                    int age = input2.nextInt();
                    System.out.println("Enter your flight number:");
                    flightNumber = input2.nextInt();

                    if (member.equals("y") == true) {
                        System.out.println("How many years have you been a member?");
                        int numOfYears = input2.nextInt();
                        Passenger passenger = new Member(numOfYears, name, age);
                        manager.bookSeat(flightNumber, passenger);
                        System.out.println("");
                    } else if (member.equals("n") == true) {
                        Passenger passenger = new NonMember(name, age);
                        manager.bookSeat(flightNumber, passenger);
                        System.out.println("");
                    }
                    break;
                case "e":
                    end = true;
                    System.out.println("End of program. Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice. Goodbye.");
                    break;
            }
        }
    }
}
