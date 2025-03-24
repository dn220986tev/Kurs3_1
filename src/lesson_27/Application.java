package lesson_27;

public class Application {

    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-122111212");

        Autobus bus = new Autobus(busDriver, 15);

        System.out.println(bus.toString());

        BusDriver busDriver1 = new BusDriver("Margo", "AR-45355445");
        bus.setDriver(busDriver1);

        System.out.println(bus.toString());

        bus.showListPassengers();

        System.out.println("\n===============");

        Passenger john = new Passenger("John");
        Passenger mario = new Passenger("Mario");
        Passenger jane = new Passenger("Jane");

        System.out.println(john.toString());
        System.out.println(mario.toString());

        bus.takePassenger(john);
        bus.takePassenger(john);

        bus.takePassenger(mario);

        bus.takePassenger(jane);
        bus.takePassenger(jane);

        System.out.println("Кол-во пассажиров: " + bus.getCountPassengers());



        bus.showListPassengers();





    }
}