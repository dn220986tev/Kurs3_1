package lesson.HA27.autopark;

public class BusApp {
    public static void main(String[] args) {


        BusDriver driver = new BusDriver("Peter", "LN-00000011");

        Autobus autobus = new Autobus(driver, 4);

        System.out.println(autobus.toString());

        Passenger pas1 = new Passenger("John");
        Passenger pas2= new Passenger("Max");
        Passenger pas3 = new Passenger("Hanna");
        Passenger pas4 = new Passenger("Luisa");
        Passenger pas5 = new Passenger("Passenger");

        autobus.takePassenger(pas1);
        autobus.takePassenger(pas2);
        autobus.takePassenger(pas5);
        autobus.takePassenger(pas3);
        autobus.takePassenger(pas4);

        autobus.showListPassengers();

        System.out.println("\n =============");
        System.out.println("dropPassenger(pas4): " + autobus.dropPassenger(pas4));

        System.out.println("dropPassenger(pas5): " + autobus.dropPassenger(pas2));
        autobus.showListPassengers();

        autobus.takePassenger(pas1);
        System.out.println("takePassenger(pas4): " + autobus.takePassenger(pas4));
        autobus.showListPassengers();

        System.out.println(autobus.toString());

    }
}