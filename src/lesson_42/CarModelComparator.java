package lesson_42;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        String model1 = car1.getModel();
        String model2 = car2.getModel();

        // Класс String имеет реализацию интерфейса Comparable -> метод compareTo
        return model1.compareTo(model2);
//        return car1.getModel().compareTo(car2.getModel());
    }
}