import java.util.ArrayList;

public class Plane {

    private PlaneType plane;
    private Integer capacity;
    private Integer maxWeight;

    public Plane(PlaneType plane, Integer capacity, Integer maxWeight){
        this.plane = plane;
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    public PlaneType getPlaneType() {return this.plane; }


    public int getCapacity(){
        return this.capacity;
    }

    public int getMaxWeight(){
        return this.maxWeight;
    }

}
