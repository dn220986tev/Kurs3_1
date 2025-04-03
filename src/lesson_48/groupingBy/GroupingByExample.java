package lesson_48.groupingBy;

import java.util.*;
import java.util.stream.Collectors;


public class GroupingByExample {
    /*
    Collectors.groupingBy(Function classifier) - простейшая форму группировки
    Группирует элементы по ключу, полученному с помощью функции-классификатора
    Результатом будет Map<K, List<T>>
     */

    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    private static void task3() {
        List<Employee> employees = new ArrayList<>(
                List.of(
                        new Employee("Petr", 2500, 25, "developer", "IT"),
                        new Employee("Silvia", 1500, 19, "trainee", "IT"),
                        new Employee("Stefan", 2500, 30, "PM", "IT"),
                        new Employee("Olivia", 2500, 25, "manager", "Management"),
                        new Employee("Sebastian", 3500, 28, "chef", "Management"),
                        new Employee("Hanna", 2000, 35, "chef", "Cleaning"),
                        new Employee("Max", 1300, 45, "cleaner", "Cleaning"),
                        new Employee("John", 3200, 19, "chef", "IT")
                )
        );

        // Сгруппировать сотрудников ао отделам
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
//                .collect(Collectors.groupingBy(emp -> emp.getDepartment()));

        System.out.println("groupingBy(Employee::getDepartment): ");
        map.forEach((department, employeeList) -> System.out.println(department + ": " + employeeList));

        List<Employee> itList = map.get("IT");
        System.out.println("itList: " + itList);

        // Коллектор для значений. В какую коллекцию собирать значения, соответствующие ключу
        Map<String, Set<Employee>> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));

        printMap(map2);

        map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, LinkedHashMap::new, Collectors.toSet()));

        // Количество сотрудников по отделам
        Map<String, Long> map3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        printMap(map3);

        // Расчет средней зарплаты по отделу
        Map<String, Double> map4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        printMap(map4);

        // Список зарплат в каждом отделе
        Map<String, List<Double>> map5 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary, Collectors.toList())));

        printMap(map5);

        // Суммарная статистика

//        IntSummaryStatistics
        DoubleSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("max: " + statistics.getMax());
        System.out.println("min: " + statistics.getMin());
        System.out.println("avg: " + statistics.getAverage());
        System.out.println("count: " + statistics.getCount());
        System.out.println("sum: " + statistics.getSum());
        System.out.println("statistics: " + statistics);




    }

    private static <K,V> void printMap(Map<K, V> map) {
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("======================\n");
    }

    private static void task2() {
        List<Integer> integers = List.of(1, 2, 3, -10, 105, 4, 6, -21, 0, 200, 140, 350);

        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> {
                    if (i == 0) return "Zero";
                    if (i < 0) return "Negative";
                    if (i % 2 == 0) return "Even";
                    return "Odd";
                }));

        System.out.println("map: " + map);
        List<Integer> even = map.get("Even");
        System.out.println("even: " + even);

    }

    private static void task1() {
        List<Integer> integers = List.of(1, 2, 9, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // even : {2, 4, 6, 10..}
        // odd : {9, 3, 5, 7...}

        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> (i % 2 == 0) ? "even" : "odd"));

        System.out.println(map);


    }


}