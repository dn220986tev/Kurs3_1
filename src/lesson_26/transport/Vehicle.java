package lesson_26.transport;

public class Vehicle {
    protected String model; // наследники будут иметь прямой доступ к полю
    private int year; // наследники прямого доступа иметь не будут. Только через геттеры/сеттеры, если они есть

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }



    public String toString() {
        return model + ", year of manufacture : " + year;
    }

    public void  start() {
        System.out.println(model + " начинает движение");
    }

    public void stop() {
        System.out.println(model + " останавливается");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }


}
