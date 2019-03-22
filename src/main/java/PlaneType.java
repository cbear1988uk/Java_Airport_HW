public enum PlaneType {

    BOEING_747(416, 443613),
    AIRBUS_A300(266, 589670),
    BOEING_777(396, 351500);

    private final int capacity;
    private final int maxWeight;

    PlaneType(int capacity, int maxWeight) {this.capacity = capacity; this.maxWeight = maxWeight; }

    public int getCapacity() {return capacity; }
    public int getMaxWeight() {return maxWeight; }

}
