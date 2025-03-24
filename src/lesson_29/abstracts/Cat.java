package lesson_29.abstracts;

public class Cat extends Animal {

    @Override
    void move() {
        System.out.println("Кот передвигается");
    }

    @Override
    void eat() {
        System.out.println("Кот очень любит кушать!");
    }
}
