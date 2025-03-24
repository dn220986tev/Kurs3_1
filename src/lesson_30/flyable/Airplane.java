package lesson_30.flyable;

public class Airplane extends Transport implements Flyable  {


    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    boolean takePassenger() {
        if (amountPassengers < capacity) {
            amountPassengers++;
            return true;
        }

        return false;
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }
}