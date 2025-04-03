package lesson48.HA;

import java.util.List;
import java.util.stream.Collectors;

public class task3 {
    public static List<Integer> processNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n% 2 ==0)
                .map(n -> n*2)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result =processNumbers(numbers);
        System.out.println(result);
    }
}
