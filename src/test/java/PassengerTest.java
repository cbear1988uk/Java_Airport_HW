import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passengers passenger;

    @Before
    public void setup(){
        passenger = new Passengers("Hugo Reyes", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Hugo Reyes", passenger.hasName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger.hasBags());
    }
}
