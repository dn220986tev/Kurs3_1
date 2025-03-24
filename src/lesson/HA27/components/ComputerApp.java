package lesson.HA27.components;

/*
Task 2
Компьютер и компоненты

- Создайте базовый класс Component с полями brand (бренд) и model (модель).

Создайте производные классы: Processor, Memory, Storage от класса Component.

Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.

Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.
 */

public class ComputerApp {

    public static void main(String[] args) {

        Storage storage = new Storage("WD", "WD-1000");

        Computer computer = new Computer("LE-5100", storage);
        System.out.println(computer.toString());

        Storage storage1 = new Storage("Gnusmas", "SA-500");
        Computer computer1 = new Computer("ROG-01", storage1, 64);
        System.out.println(computer1.toString());


    }
}