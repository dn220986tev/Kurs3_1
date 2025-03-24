package lesson25.HA;

/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и
- площади круга по ее радиусу

Класс должен содержать:

- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)

 */

// Lombok
public class Calculator25 {

    /*
    1. Поля класса, в том числе константы.
    2. Блоки инициализации, если они есть
    3. Конструктор/-ы, если они есть
    4. Методы (статические и не статические обычно не разделяются)
     */

    public static final double PI = 3.141519;

    public static double circleArea(double radius) {
        // Pi * r ^ 2
        return PI * radius * radius;
    }

    public static double circlePerimeter(double radius) {
        // 2 * PI * r == PI * d
        return 2 * PI * radius;
    }


    public static int add(int i1, int i2) {

        return i1 + i2;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0) return Integer.MAX_VALUE;
        return a / b;
    }


    public static int multiply(int a, int b) {
        return a * b;
    }



}
