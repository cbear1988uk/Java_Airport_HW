import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING_777);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING_777, plane.getPlaneType());
    }

    @Test
    public void canGetCapacityFromEnum(){
        assertEquals(396, plane.getCapacityFromEnum());
    }

    @Test
    public void canGetMaxWeightFromEnum(){
        assertEquals(351500, plane.getMaxWeightFromEnum());
    }
}
