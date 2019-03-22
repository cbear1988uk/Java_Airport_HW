public class Passengers {

    private String name;
    private Integer bags;

    public Passengers(String name, Integer bags){
        this.name = name;
        this.bags = bags;
    }


    public String hasName() {
        return this.name;
    }


    public int hasBags() {
        return this.bags;
    }
}
