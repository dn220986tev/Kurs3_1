package lesson_22.HA;

import java.util.Arrays;

public class ArrayEncapsTest {

    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};

        MagicArrayEncaps magic = new MagicArrayEncaps(test);


        magic.add(10);

        System.out.println(magic.toString());

        test[3] = 1000;


        magic.add(20, 330, 40);
        magic.test();
        System.out.println(magic.toString());

        int[] fromMagic = magic.toArray();
        System.out.println(fromMagic.length);
        System.out.println("массив: " + Arrays.toString(fromMagic));

        System.out.println("\n=========== remove");

        System.out.println(magic.removeByValue(330));
        System.out.println(magic.removeByValue(10000));
        System.out.println(magic.removeByValue(-2_147_483_647));
        System.out.println(magic.toString());


    }
}