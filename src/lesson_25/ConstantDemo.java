package lesson_25;

/*
 В Java константа переменная, изменить которую не может НИ ОДИН объект класса в котором она находится.
 Такая переменная создается и инициализируется один раз для всех экземпляров класса.

 В Java константой считается НЕ та переменная, которую нельзя изменить в рамках одного объекта.

 static - делает переменную единственной для всех экземпляров класса (единое значение)
 + final делает ее неизменяемой.
  */

public class ConstantDemo {

    public static final double PI = 3.141519; // Константа.
    public static final String MY_COUNTRY = "Germany"; // Константа, т.к. невозможно изменить значение строки (состояние объекта)

    public static final String[] colors = {"blue", "red", "green"}; // НЕ константа, т.к. значения в массиве можно изменить
    // Не является константой, т.к. состояние объекта (значения в массиве) можно изменить
    public static final int[] ints = new int[5];

    public ConstantDemo() {
        colors[0] = "purple";
        //  COUNTRY = "USA"; - не могу изменить
        String newString = MY_COUNTRY.toUpperCase();
    }

    public static double doublePiSqrt() {
        double result = 2 * PI * PI;
        return result;
    }

}

