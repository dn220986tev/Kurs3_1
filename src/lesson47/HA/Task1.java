package lesson47.HA;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {
    public static List<Integer> filterNumbers(List<Integer> numbers) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> greaterThanTen = n -> n > 10;
        Predicate<Integer> lessThanHundred = n -> n < 100;
        return numbers.stream()
                .filter(isEven.and(greaterThanTen).and(lessThanHundred))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 100, 34, 7, 88, 102, 50);
        List<Integer> filteredNumbers = filterNumbers(numbers);
        System.out.println("filteredNumbers:" + filteredNumbers);//[12, 34, 88, 50]
    }

    }

