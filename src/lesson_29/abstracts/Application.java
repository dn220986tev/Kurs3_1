package lesson_29.abstracts;

public class Application {

    public static void main(String[] args) {

        // Нельзя создать объект абстрактного класса
        // Animal animal = new Animal();

        Cat cat = new Cat();

        cat.eat();
        cat.sayHello();


    }
}