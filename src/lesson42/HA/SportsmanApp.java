package lesson42.HA;
import java.util.Arrays;
/*
Task 1
Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).
Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.
Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.
В методе main создайте массив из нескольких объектов Sportsman.


Отсортируйте его с использованием:

естественного порядка, определенного в Comparable,
данного класса Comparator,
анонимного класса Comparator для сортировки по третьему полю (например, age).
Выведите каждый вариант отсортированного массива в консоль.
 */

public class SportsmanApp {

    public static void main(String[] args) {

        Sportsman[] sportsmanArray = new Sportsman[6];
        sportsmanArray[0] = new Sportsman("John", 28, 100.5);
        sportsmanArray[1] = new Sportsman("Alex", 24, 90.75);
        sportsmanArray[2] = new Sportsman("Bob", 30, 100.5);
        sportsmanArray[3] = new Sportsman("Tom", 30, 50);
        sportsmanArray[4] = new Sportsman("Hanna", 25, 90.5);
        sportsmanArray[5] = new Sportsman("Zlatan", 25, 91);

        Arrays.sort(sportsmanArray);

        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }

        System.out.println("====================\n");

        Arrays.sort(sportsmanArray, new SportsmanScoreComparator());
        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }

        System.out.println((int) (90.5 - 90.75));
        System.out.println(Double.compare(90.50, 90.75));

        System.out.println("================\n");

        Arrays.sort(sportsmanArray, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }

    }
}