package lesson_28.staticPolimorphism;

/*
В Java полиморфизм проявляется двух формах:

Статический (компиляционный) полиморфизм - реализуется с помощью перегрузки методов (Method Overloading)

Динамический (исполнительный ) полиморфизм - реализуется через переопределение методов (Method Overriding)
 */

public class MathOperations {

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(sum(1, 2));

    }
}
