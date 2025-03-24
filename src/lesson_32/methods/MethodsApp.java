package lesson_32.methods;

import lists.MyArrayList;
import lists.MyList;

import java.util.Arrays;


public class MethodsApp {

    public static void main(String[] args) {

        Integer[] integers = {0, 1, 2, 3, 4, 5, 6};

        Utils.swap(integers, 2, 5);
        System.out.println(Arrays.toString(integers));

        String[] strings = {"Hello", "Java", "World", "JS"};
        Utils.swap(strings, 1, 2);
        System.out.println(Arrays.toString(strings));

        int[] intArray = {1, 2, 3, 4, 5, 6};
//        Utils.swap(intArray, 1,2); // массив примитивов не примет


        MyList<Double> doubleList = new MyArrayList<>(new Double[]{1.5, 2.5, 3.5});

        Double firstValue = Utils.getFirstElement(doubleList);
        System.out.println("firstValue: " + firstValue);

        MyList<String> stringList = new MyArrayList<>(strings);
        System.out.println(Utils.getFirstElement(stringList));

        System.out.println("\n =================");

//        int sum = Utils.sumElements("Hello", "World"); типобеопасность
        int sum = Utils.sumElements( 1, 3.5, 10, 11.5, 1.1);
        System.out.println("sum: " + sum);

        double sumD = Utils.listSum(doubleList);
        System.out.println("sumD: " + sumD);

        System.out.println("\n =================");
        MyList<Integer> integerList = new MyArrayList<>(integers);

        Utils.addNumbers(integerList);



    }
}