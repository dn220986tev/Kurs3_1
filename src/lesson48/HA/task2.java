package lesson48.HA;

import java.util.List;
import java.util.Optional;

public class task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "kiwi", "grape", "orange");

        Optional<String> minLengthString = strings.stream()
                .min((str1, str2) ->Integer.compare(str1.length(), str2.length()));
        minLengthString.ifPresent(System.out::println);

    }
}
