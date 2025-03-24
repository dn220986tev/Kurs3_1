package Lesson24.HA;

public class Calculator {

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
        return a* b;
    }

}
