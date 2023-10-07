/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivanu
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of flight constructor, of class Flight.
     */
    @Test
    public void testConstructor() {
        System.out.println("Flight Constructor Test");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        
        int expResultFlightNumber = 1;
        String expResultOrigin = "Toronto";
        String expResultDestination = "Calgary";
        String expResultDepartureTime = "01/28/2023 6pm";
        int expResultCapacity = 300;
        int expResultNumberOfSeatsLeft = 300;
        double expResultOriginalPrice = 200;
        
        int resultFlightNumber = instance.getFlightNumber();
        String resultOrigin = instance.getOrigin();
        String resultDestination = instance.getDestination();
        String resultDepartureTime = instance.getDepartureTime();
        int resultCapacity = instance.getCapacity();
        int resultNumberOfSeatsLeft = instance.getNumberOfSeatsLeft();
        double resultOriginalPrice = instance.getOriginalPrice();
        
        assertEquals(expResultOrigin, resultOrigin);
        assertEquals(expResultDestination, resultDestination);
        assertEquals(expResultDepartureTime, resultDepartureTime);
        assertEquals(expResultCapacity, resultCapacity);
        assertEquals(expResultNumberOfSeatsLeft, resultNumberOfSeatsLeft);
        assertEquals(expResultOriginalPrice, resultOriginalPrice, 200);
    }
    /**
     * Test of flight constructor, of class Flight. If invalid input.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        System.out.println("Invalid Flight Constructor Test");
        Flight instance = new Flight(1, "Toronto", "Toronto", "01/28/2023 6pm", 300, 200);
    }
    
    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        String expResult = "Calgary";
        String result = instance.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        String expResult = "01/28/2023 6pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        int expResult = 300;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        int expResult = 300;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        double expResult = 200;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 200);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Ottawa";
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        instance.setOrigin(origin);
        assertEquals("Ottawa", instance.getOrigin());
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Vancouver";
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        instance.setDestination(destination);
        assertEquals("Vancouver", instance.getDestination());
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "01/29/2023 6pm";
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        instance.setDepartureTime(departureTime);
        assertEquals("01/29/2023 6pm", instance.getDepartureTime());
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 250;
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        instance.setCapacity(capacity);
        assertEquals(250, instance.getCapacity());
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 350;
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        assertEquals(350, instance.getNumberOfSeatsLeft());
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 500;
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        instance.setOriginalPrice(originalPrice);
        assertEquals(500, instance.getOriginalPrice(), 500);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1, "Toronto", "Calgary", "01/28/2023 6pm", 300, 200);
        String expResult = "Flight 1, Toronto to Calgary, 01/28/2023 6pm, original price: $200.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
