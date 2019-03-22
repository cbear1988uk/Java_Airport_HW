import java.util.ArrayList;

public class Flight {

    private String flightNum;
    private String destination;
    private String departureLocation;
    private String departureTime;
    private Integer availableSeats;
    private ArrayList<Passengers> flightCabin;
    private PlaneType plane;

    public Flight(PlaneType plane, String flightNum, String destination,
                  String departureLocation, String departureTime, Integer availableSeats){
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
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

    public int getAvailableSeats(){
        return this.availableSeats;
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

    public void remove(Passengers passenger1) {
        this.flightCabin.remove(passenger1);
    }

    public int getRemainingSeats() {
        return this.availableSeats - this.flightCabin.size();
    }
}
