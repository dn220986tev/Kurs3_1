package lesson_30.flyable;

public abstract class Transport {
    int capacity;
    int amountPassengers;

    public Transport(int capacity) {
        this.capacity = capacity;
    }
    abstract boolean takePassenger();

    public int getCapacity() {
        return capacity;
    }
}