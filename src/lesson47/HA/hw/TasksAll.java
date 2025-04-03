package lesson47.HA.hw;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
четные,
больше 10
и меньше 100

Для фильтрации используйте Stream API

Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки,
которые начинаются на определенную букву (например, "A")
и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.

Task 3
Дан список Person с полями name, age, city.

Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе,
а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */

public class TasksAll {

    public static void main(String[] args) {
        String test = "Hello";
//        System.out.println(test.substring(0, 1));
        // проверяет, заканчивается ли строка на другую строку
        System.out.println(test.endsWith("llo"));
        System.out.println(test.endsWith("ll"));
        // проверяет, начинаться ли строка на другую строку
        System.out.println(test.startsWith("H"));
        System.out.println(test.startsWith("ell"));

        // проверяет, содержит ли строка другую строку
        System.out.println(test.contains("llo"));

        System.out.println("================\n");
        List<String> strings = List.of("test", "Abba", "Arrow", "Java", "a", "annotation");

        System.out.println(filterStrings(strings));

        List<Person> people = new ArrayList<>(
                List.of(
                        new Person("Person", 21, "Munchin"),
                        new Person("Person2", 28, "Berlin"),
                        new Person("Person3", 27, "Koln"),
                        new Person("Person4", 25, "Berlin"),
                        new Person("Person5", 19, "Berlin"),
                        new Person("Person6", 45, null)
                )
        );

        people.add(null);

        System.out.println(filterPersons(people, 25, "Berlin"));
    }

    public static List<Person> filterPersons(List<Person> persons, int age, String city) {
        return persons.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getAge() > age)
                .filter(p -> Objects.nonNull(p.getCity()))
                .filter( p -> p.getCity().equalsIgnoreCase(city))

                .collect(Collectors.toList());
    }

    public static List<String> filterStrings(List<String> strings) {
        String findMe = "A";
        return strings.stream()
//                .filter(s -> s.charAt(0) == 'A')
//                .filter(s -> s.substring(0, 1).equalsIgnoreCase("A"))
//                .filter(s -> s.toUpperCase().startsWith("A"))
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> filterIntegers(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i> 10 && i <100 )
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }

}