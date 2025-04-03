package lesson48.HA;

import java.util.List;
import java.util.stream.Collectors;

public class task1 {
    public static List<Integer> filterAndSortNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n > 10)  // Фильтруем числа, которые больше 10
                .sorted((a, b) ->Integer.compare(a % 10, b % 10))  // Сортируем по последней цифре
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(23, 45, 12, 56, 89, 102, 11, 34, 90);
        List<Integer> result = filterAndSortNumbers(numbers);
        System.out.println(result);
    }
}
