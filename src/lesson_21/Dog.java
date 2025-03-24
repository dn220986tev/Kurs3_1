package lesson_21;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void info() {
        System.out.println("I am dog " + name + ", my weight: " + weight);
    }

    public void eat() {
        System.out.println("Я кушаю, ням-ням!");
        this.weight++; // увеличиваем вес на 1
    }

    public void run() {
        /*
        1. Достаточен ли вес собачки для совершения пробежки
        2. Если вес слишком мал - собака должна поесть перед тренировкой
         */

        while (weight < 3) {
            System.out.println("Сорян, я слишком худая и голодная! Бежать не  могу.");
            System.out.println("Надо поесть!!! Мой вес сейчас: " + weight);

            eat();
        }

        System.out.println("Я бегу!");
        weight -= 2; // уменьшаем вес на 2
        System.out.println("Вес после пробежки: " + weight);
        System.out.println("==================\n");
    }
}

