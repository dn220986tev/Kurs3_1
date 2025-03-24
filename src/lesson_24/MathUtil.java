package lesson_24;

public class MathUtil {

        public static int sumIntegers(int... integers) {
            int sum = 0;
            for (int i = 0; i < integers.length; i++) {
                sum += integers[i];
            }
            return sum;
        }
}