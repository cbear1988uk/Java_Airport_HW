import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passengers passenger1;
    private Plane plane1;

    @Before
    public void setup(){
        flight = new Flight("FI431", "DEN", "GLA", "0145");
        passenger1 = new Passengers("Hugo Reyes", 2);
        plane1 = new Plane(PlaneType.BOEING_777); 
    }

    @Test
    public void doesFlightHaveAPlane(){
        assertEquals(PlaneType.BOEING_777, flight.getPlane());
    }

    @Test
    public void doesHaveFlightNumber(){
        assertEquals("FI431", flight.getFlightNumber());
    }

    @Test
    public void doesHaveDestination(){
        assertEquals("DEN", flight.getDestination());
    }

    @Test
    public void doesHaveDepartureLocation(){
        assertEquals("GLA", flight.getDepartureLocation());
    }

    @Test
    public void doesHaveDepartureTime(){
        assertEquals("0145", flight.getDepartureTime());
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void flightCanBookPassenger(){
        flight.add(passenger1);
        assertEquals(1, flight.passengerCount());
    }

}
