import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager flightManager;
    private Passengers passenger;

    @Before
    public void setup(){
        flightManager = new Manager();
        passenger = new Passengers("Frank Lapidus", 2);
    }

//    @Test
//    public void passengerHasMaxBaggageWeight(){
//        assertEquals(20, flightManager.maxBaggageWeight());
//    }
}
