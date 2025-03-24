
package lesson_25;

import java.util.Arrays;

public class StaticApp {

    public static void main(String[] args) {

        System.out.println("static counter: " + StaticBlockDemo.counter);
        System.out.println("static array: " + Arrays.toString(StaticBlockDemo.colors));

        StaticBlockDemo demo = new StaticBlockDemo();
//
//        System.out.println(demo.toString());
//        System.out.println("static array: " + Arrays.toString(StaticBlockDemo.colors));
        StaticBlockDemo demo2 = new StaticBlockDemo();
        StaticBlockDemo demo3 = new StaticBlockDemo("Title");

    }
}

