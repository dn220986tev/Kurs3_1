package lesson_28.animals;


public class Hamster extends Animal {

    // Ничего не переопределяем - получаем реализацию всех родительских методов по наследству


    // Переопределение метода родителя (Animal)
    @Override
    public String toString() {
        return "Hamster!";
    }
}