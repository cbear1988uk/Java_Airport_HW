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
        plane1 = new Plane(PlaneType.BOEING_777);    }

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
    public void canReturnNumberOfAvailableSeats(){
        assertEquals();
    }
}
