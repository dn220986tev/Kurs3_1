package Lesson24.HA;

public class CalculatorApp {

    public static void main(String[] args) {

        int x1 = 10;
        int x2 = 5;
        int result;

        result = x1 / x2;
        System.out.println("10 // 5: " + result);

//        System.out.println("10 / 0 " + (x1 / 0));

//        result = Calculator.divide(10, 0);
        double resDouble = Calculator.divide(x1, 0);
        System.out.println("result calc: " + resDouble);

        double d1 = 10.0;
        double resultD = d1 / 0;

        System.out.println("10.0 // 00: " + resultD);

        // Infinity - бесконечность
        // NaN - значение не определено (не является числом)

        double inf1 = 1.0 / 0;
        double inf2 = 1000.0 / 0;

        System.out.println(inf1 == inf2);
        System.out.println(inf1 > inf2);

        System.out.println(10.0 / 10.0);
        double res2 = inf1 / inf2;
        System.out.println("inf1 / inf2: " + res2);

        System.out.println("inf1 - inf2: " + (inf1 - inf2));
        System.out.println("inf1 + 10: " + (inf1 + 10));

        System.out.println("inf * (-1): " +( inf1 * -1));

        System.out.println(inf1 - 150000000);
        System.out.println(inf1 * 2);

        // Сравнение на равенство значения с бесконечностью.
        System.out.println(inf1 == Double.POSITIVE_INFINITY);

        int x = 10;
        double dVar = 10; // ->  10.0

        System.out.println("\n ====================== ");

        int res = Calculator.add(10, 5);
        double res1 = Calculator.add(1.00, 5.0);

        System.out.println("int: " +  res);
        System.out.println("double: " +  res1);



    }
}

