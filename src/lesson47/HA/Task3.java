package lesson47.HA;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return name + ", " + age + " years old, " + city;
    }
}

public class Task3 {
    public static List<Person> filterPersons(List<Person> persons, int minAge, String city) {
        Predicate<Person> ageFilter = p -> p.getAge() > minAge;
        Predicate<Person> cityFilter = p -> p.getCity().equals(city);

        return persons.stream()
                .filter(ageFilter.and(cityFilter))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice", 40, "Hamburg"),
                new Person("Bob", 35, "Berlin"),
                new Person("Charlie", 42, "Hamburg"),
                new Person("David", 50, "Munich")
        );

        List<Person> filteredPersons = filterPersons(persons, 38, "Hamburg");
        System.out.println("старше 38 лет и проживающих в городе Hamburg: " + filteredPersons); // [Alice, 40 years old, Hamburg, Charlie, 42 years old, Hamburg]
    }
}
