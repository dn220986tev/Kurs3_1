package lesson47.HA;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> filterAndSortStrings(List<String> strings, char startLetter){
        return strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startLetter)))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");
        List<String> filteredStrings = filterAndSortStrings(strings, 'A');
        System.out.println("filteredStrings: " + filteredStrings);// [Apple, Apricot, Avocado]
    }
}
