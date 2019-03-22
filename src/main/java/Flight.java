import java.util.ArrayList;

public class Flight {

    private String flightNum;
    private String destination;
    private String departureLocation;
    private String departureTime;
    private ArrayList<Passengers> flightCabin;
    private PlaneType plane;

    public Flight(String flightNum, String destination, String departureLocation, String departureTime){
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
        this.flightCabin = new ArrayList<Passengers>();
        this.plane = plane;
    }

    public String getFlightNumber(){
        return this.flightNum;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int passengerCount() {
        return this.flightCabin.size();
    }

    public void add(Passengers passenger1) {
        this.flightCabin.add(passenger1);
    }

    public PlaneType getPlane() {
        return plane;
    }
}
