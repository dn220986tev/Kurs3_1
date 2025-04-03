package lesson44.HA;

import java.util.*;

/*
Task 1
Напишите метод, принимающий строку и
возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

public class Task1 {

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    private static List<String> getUniqueSortedWords(String string) {
        /*
        1. Избавиться от знаков препинания
        2. Разбить строку на слова (массив / список слов)
        3. Поместить в коллекцию, которая обеспечит уникальность и сортировку (SortedSet)
        4. Преобразовать результат в список
         */

        String[] words = string.replaceAll("[^а-яА-Яa-zA-Z0-9 ]", "").split("\\s+");

        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

//        List<String> list = Arrays.asList(words);

        uniqueWords.addAll(Arrays.asList(words));

        return new ArrayList<>(uniqueWords);

    }
}










