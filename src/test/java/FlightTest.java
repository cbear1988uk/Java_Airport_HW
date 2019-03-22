import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight1;
    private Passengers passenger1;
    private Passengers passenger2;
    private Plane plane1;
    private Seats seat;

    @Before
    public void setup(){
        flight1 = new Flight(PlaneType.BOEING_777, "FI431", "DEN", "GLA", "0145", 396);
        passenger1 = new Passengers("Hugo Reyes", 2);
        passenger2 = new Passengers("James Ford", 1);
        plane1 = new Plane(PlaneType.BOEING_777, 396, 1000);
        seat = new Seats();
    }

    @Test
    public void doesFlightHaveAPlane(){
        assertEquals(PlaneType.BOEING_777, flight1.getPlane());
    }

    @Test
    public void doesHaveFlightNumber(){
        assertEquals("FI431", flight1.getFlightNumber());
    }

    @Test
    public void doesHaveDestination(){
        assertEquals("DEN", flight1.getDestination());
    }

    @Test
    public void doesHaveDepartureLocation(){
        assertEquals("GLA", flight1.getDepartureLocation());
    }

    @Test
    public void doesHaveDepartureTime(){
        assertEquals("0145", flight1.getDepartureTime());
    }

    @Test
    public void doesHaveAvailableSeats(){
        assertEquals(396, flight1.getAvailableSeats());
    }

    @Test
    public void flightCanBookPassenger(){
        flight1.add(passenger1);
        assertEquals(1, flight1.passengerCount());
    }

    @Test
    public void flightCanRemovePassenger(){
        flight1.remove(passenger1);
        assertEquals(0, flight1.passengerCount());
    }

    @Test
    public void flightHasSeatRemainder(){
        flight1.add(passenger1);
        assertEquals(395, flight1.getRemainingSeats());
    }

}
