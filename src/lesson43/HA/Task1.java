package lesson43.HA;

import java.util.ArrayList;
import java.util.List;

/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

public class Task1 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 3));
        List<Integer> integers2 = new ArrayList<>(List.of(3, 4, 4, 5, 6, 5, 7, 8));


        List<Integer> result = intersection(integers, integers2);
        System.out.println(result);

        System.out.println("нач.список: " + integers);
        System.out.println(intersection(integers2, integers));
    }

    private static <T> List<T> intersection(List<T> integers, List<T> integers2) {
        List<T> result = new ArrayList<>(integers);
        result.retainAll(integers2);
        return result;
    }
}