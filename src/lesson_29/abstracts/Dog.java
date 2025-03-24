package lesson_29.abstracts;

// Если потомок реализован НЕ все абстрактные методы родителя,
// должен быть помечен как абстрактный

public abstract class Dog extends Animal {

    @Override
    void move() {
        System.out.println("Dog move");
    }
}