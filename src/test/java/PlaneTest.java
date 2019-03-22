import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING_777, 396, 1000);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING_777, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(396, plane.getCapacity());
    }

    @Test
    public void planeHasMaxWeight(){
        assertEquals(1000, plane.getMaxWeight());
    }
}
