package lesson_26.transport;

// extends - наследование. Bus наследуется от Vehicle.
//  Smartphone is-a Vehicle -> НЕ верно. Применять наследование НЕЛЬЗЯ
// Bus is-a Vehicle - верно. Можно применить наследование.

public class Bus extends Vehicle{

    private int capacity;
    private int countPassengers;

    // Так выглядит конструктор по-умолчанию для класса-потомка
//    public Bus() {
//        // Ключевое слово super - это обращение к родительскому классу
//        // super() - вызов конструктора родительского класса
//        super();
//    }


    public Bus(String model, int year, int capacity) {
        // Нужно сначала создать объект родителя
        // Если в конструкторе потомке нет явного вызова конструктора-родителя,
        // то автоматически будет вызван пустой конструктор родителя
        super(model, year); // вызов родительского конструктора, принимающего модель и год
        // Вызов конструктора родителя должен быть первой строчкой исполняемого кода
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean  takePassenger() {
        // Проверить есть ли свободное место?
        // если есть - посадить - увеличить кол-во пассажиров в автобусе
        if (countPassengers < capacity) {
            countPassengers++;
            // имею доступ в наследнике к полю родителя с модификатором protected
            System.out.println("Пассажир зашел в автобус: " + model);
//            System.out.println("Пассажир зашел в автобус: " + getModel());
            return true;
        }
        // По сути и есть блок else. В эту строку я попаду только если условие if выдаст false

        System.out.printf("В автобусе %s больше месте нет. Сейчас %d пассажиров\n",
                model, countPassengers);
        return false;
    }

    // метод высадки пассажира из автобуса
    public boolean dropPassenger() {
        // Главная задача не уйти в минус
        // TODO реализовать метод
        return false;
    }
}