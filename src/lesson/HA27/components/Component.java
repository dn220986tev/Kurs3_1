package lesson.HA27.components;

public class Component {
    private final String brand;
    private final String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        return "Component: " + brand + ", model: " + model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}