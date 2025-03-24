package lesson.HA27.components;

public class Computer {

    private final String model;
    private Processor processor; // композиция (жесткая связь)
    private final Memory memory; // композиция (жесткая связь)
    private Storage storage; // агрегация (мягкая связь)

    public Computer(String model, Storage storage) {
        this.model = model;
        this.storage = storage;
        this.processor = new Processor("AMD", "AMD-01");
        this.memory = new Memory("Samsung", "M-02", 32);
    }

    public Computer(String model, Storage storage, int memoryCapacity) {
        this.model = model;
        this.storage = storage;
        this.processor = new Processor("AMD", "AMD-01");
        this.memory = new Memory("Samsung", "M-02", memoryCapacity);
    }

    public String toString() {
        return String.format("Computer: {model: %s, processor: %s, memory size: %d, storage: %s}",
                model, processor.toString(), memory.getSize(), storage.toString());
    }


    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }
}