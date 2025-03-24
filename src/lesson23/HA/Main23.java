package lesson23.HA;

public class Main23 {
    public static void main(String[] args) {

        MagicArrayHW23 magicArray = new MagicArrayHW23();

        magicArray.add(1, 2, 3, 4, 5);

        System.out.println(magicArray.toString());

//        magicArray.array[8] = 1000;
//
//        magicArray.array = null;

//      magicArray.cursor = -5;

        magicArray.add(100);


        magicArray.test();

        System.out.println(magicArray.toString());


    }
}