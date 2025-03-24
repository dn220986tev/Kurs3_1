package lesson.HA27.components;

public class Memory extends Component {

    private final int size;


    public Memory(String brand, String model, int size) {
        super(brand, model);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}