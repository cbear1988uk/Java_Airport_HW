public class Flight {

    private String flightNum;
    private String destination;
    private String departureLocation;
    private String departureTime;

    public Flight(String flightNum, String destination, String departureLocation, String departureTime){
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
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
}
