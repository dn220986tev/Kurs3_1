package lesson_48;
import lesson_47.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Stream API - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле

Основная идея - преобразование последовательности элементов через набор операций.

Stream (поток) - поток данных представляет собой последовательность элементов.
Поток дает возможность поочередного получения элементов для обработки.
Стримы могут быть созданы из различных источников (коллекции, массивы, файлы, консоль и т.п.)

Pipeline - последовательность операций, выполняемых на потоке данных.

 Промежуточный операции / методы (Intermediate operations) - это операции, которые преобразуют поток в другой поток (возвращают поток)
 Их может быть много (больше чем одна)

 Терминальные операции / методы - Это операции, которые запускают обработку потока и закрывают его.
 После выполнения терминальной операции поток перестает быть доступным для дальнейшей обработки.
 Может быть ТОЛЬКО ОДИН терминальный метод

 Ленивые вычисления
 Стримы не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод.


 */

public class StreamExamplePart2 {

    /*
    Промежуточные методы (ВСЕ возвращают поток):
    Stream<T> filter(Predicate<T> predicate) - оставляет в потоке только те элементы, для которых предикат вернет true
    Т.е. оставляет элементы, удовлетворяющие условию. (Отбрасывает элементы НЕ удовлетворяющие условию)

    sorted() - сортирует поток в естественном порядке
    sorted(Comparator<T> comparator) - сортирует элементы потока с использованием компаратора.

    Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
    в том числе в другой тип данных

    Stream<T> peek(Consumer<T> action) - выполняет действие для каждого элемента потока
    Действие, как правило, не изменяющее элемент

    distinct() - Удаляет дубликаты из потока. Сравнивание (определение равенства) методом equals().

    limit(long maxSize) - ограничивает кол-во элементов потока. В потоке может быть не больше maxSize элементов

    skip(long n) - отбрасывает (пропускает) первые n элементов потока

    Stream<T> mapToObj(Function() mapper) - преобразование примитивного типа данных в ссылочный
    при помощи заданной функции

    boxed() - преобразует потока примитивов (IntStream и т.п.) в поток соответствующих оберток (Stream<Integer>)

    mapToInt() - преобразует поток Stream<Integer> в поток примитивов IntStream

    ___

    Терминальные методы:

    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций или другие структуры данных.

    void foreach(Consumer<T> action) - выполняет заданное действие для каждого элемента потока.

    Optional<T> max(Comparator<T> comparator) - возвращает элемент с максимальным значением (самое правое) по мнению компаратора
    Optional<T> min(Comparator<T> comparator) - возвращает элемент с минимальным значением (самое левое) по мнению компаратора

    long count() - возвращает количество элементов в потоке

    Optional<T> findFirst() - получить первый элемент потока
    Optional<T> findAny() - получить случайный элемент потока

     */

    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task8_1();
//        task9();
//        task10();
//        task11();
//        task12();
//        task13();
//        task14();
//        task15();
        task16();


    }

    private static void task16() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Преобразовать массив примитивов в список (коллекцию), используя Stream API

        // Stream<int> - не бывает. IntStream, DoubleStream... - бывают потоки примитивов
        List<Integer> integers =  Arrays.stream(ints)
//                .mapToObj( i -> Integer.valueOf(i))
//                .mapToObj(Integer::valueOf)
                // работает автоупаковка int -> Integer
//                .mapToObj(i -> i)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("integers: " + integers);

        // Получить из коллекции Integer - массив примитивов
        int[] intArray = integers.stream()
                // автораспаковка
                .mapToInt(i -> i)
                // хочет поток примитивов
                .toArray();

        System.out.println("массив: " + Arrays.toString(intArray));

    }

    private static void task15() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, 45, -25);
        // Получит первый (самый левый) элемент потока.

        // Альтернативный способ нахождения минимума
        Optional<Integer> first = integers.stream()
                .sorted()
//                .findFirst(); // получить первый элемент потока
                .findAny(); // получить случайный элемент потока

        int min = first.get();

        System.out.println("min = " + min);

    }

    private static void task14() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, 45, -25);
        // Получить список, состоящий из трех самых маленьких чисел списка

        // {-1, 3}
        // {-25, -10, -5, 0...56}
        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("smallest: " + smallest);

        // Получить список чисел, отбросив 2 самых маленьких
        // -> {-5, 0...56}
        List<Integer> list = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("list: " + list);

    }

    private static void task13() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, 45, -25);

        // Посчитать количество четных чисел в списке используя Stream API
        long count = integers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("count: " + count);

    }

    private static void task12() {
        List<Cat> cats = getListCats();

        // Найти самое длинное имя кота из списка котов
        /*
        Стрим Cat -> Stream имен
        Найти самое длинное имя (сравнивать имена по их длине)
         */

        Optional<String> longestNameOptional = cats.stream()
                .filter(Objects::nonNull) // проверка объектов типа Cat на null
                .map(cat -> cat.getName())
//                .map(Cat::getName)
                .filter(Objects::nonNull) // проверка имен на null
                .max(Comparator.comparing(String::length));
//                .max(Comparator.comparing(str -> str.length()));
//                .max((name1, name2) -> Integer.compare(name1.length(), name2.length()));
//                .max((name1, name2) -> name1.length() - name2.length());

        if (longestNameOptional.isPresent()) {
            System.out.println(longestNameOptional.get());
        } else {
            System.out.println("Котов с имена не найдено");
        }

        String longestName = cats.stream()
                .map(Cat::getName)
                .max(Comparator.comparing(String::length))
                .orElse(null);
//                .orElse("");
        System.out.println("longestName: " + longestName);

        // aaaaN -> AaaaN

    }


    private static void task11() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, 45, -25);

        // Найти максимальное число из списка
        Optional<Integer> max = integers.stream()
                .max(Comparator.naturalOrder());

        System.out.println("max: " + max);
        System.out.println("max: " + max.orElse(null));

        // Найти самое маленькое число в потоке, которое больше 100
        Optional<Integer> minVal = integers.stream()
                .filter(n -> n > 100)
                .min(Integer::compareTo);

        System.out.println("minVal: " + minVal);
        System.out.println("minVal: " + minVal.orElse(null));

    }

    private static void task10() {
        // Удалить дубликаты (повторяющиеся значения) из списка
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);

        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);

        System.out.println("=================\n");
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");
        Cat cat4 = new Cat("Panda", 4, "black");

        List<Cat> cats = Arrays.asList(cat, cat1, cat2, cat3, cat4, cat);

        cats.forEach(System.out::println);

        System.out.println("======== filter ===========\n");

        cats.stream()
                .distinct()
                .forEach(System.out::println);

    }

    private static void task9() {
        // создание стрима из Map

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        // Создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("map: " + map);
    }

    private static void task8_1() {
        List<lesson_47.Cat> cats = new ArrayList<>(getListCats());
        cats.add(null);
        System.out.println(cats);
    }

    private static void task8() {
        lesson_47.Cat cat = new lesson_47.Cat("Bear", 5, "braun");
        lesson_47.Cat cat1 = new lesson_47.Cat("Python", 7, "green");
        lesson_47.Cat cat2 = new lesson_47.Cat("Tiger", 3, "yellow");
        lesson_47.Cat cat3 = new lesson_47.Cat("Panda", 4, "black");

        lesson_47.Cat[] cats = {cat, cat1, null, cat2, new lesson_47.Cat(null, 10, "red"), cat3};

        // Получить список кошек, имя которых длиннее 4 символов

        // Arrays.stream(cats)- создает поток из элементов массива

        List<lesson_47.Cat> longCats = Arrays.stream(cats)
//                .filter(c -> c != null) // оставить в потоке только не null
//                .filter(c -> Objects.nonNull(c)) // оставить в потоке только не null
                .filter(Objects::nonNull) // оставить в потоке только не null
                .filter(c -> Objects.nonNull(c.getName())) // проверка какого-то поля на null
                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());

        /*
        Objects.nonNull(null) вернет true, если параметр НЕ null
        Objects.isNull(null) вернет true, если параметр null

         */

        System.out.println(longCats);

    }

    private static void task7() {
        List<lesson_47.Cat> cats = getListCats();

        // Вывести на экран имена котов, чей вес меньше 5
        // вывести на экран котов, оставшихся в потоке после фильтрации

        Stream<String> catStream = cats.stream()
                .peek(System.out::println)
                .filter(c -> c.getWeight() < 5)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(c -> c.getName());

        /*
        peek - промежуточный метод. Используется в основном для отладки. Не закрывает поток
        foreach - терминальный метод. Для выполнения действия с каждым элементом потока. Закрывает поток
         */

        catStream.forEach(name -> System.out.println("Terminal: " + name));

    }

    private static void task6() {
        List<lesson_47.Cat> cats = getListCats();

        // Получить список имен кошек, у которых имена короче 5 символов

         /*
        Классический - методы фильтрации должны выполняться в потоке как можно раньше
        Эффективность
         */

        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(lesson_47.Cat::getName)
                .collect(Collectors.toList());
        System.out.println(names1);

        /*
        Читаемость, понимание кода
         */
        System.out.println("\n================");
        List<String> names2 = cats.stream()
                .map(lesson_47.Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println(names2);

    }

    private static void task5() {
        List<lesson_47.Cat> cats = getListCats();
        /*
        Получить список имен кошек, чей вес больше 4.
        Создать поток кошек.
        Оставить кошек, чей вес больше 4.
        Изменить тип потока - Cat -> String (name).
        Собрать это в список
         */

        List<String> names = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(lesson_47.Cat::getName)
//                .map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println(names);
    }

    private static void task4() {
        List<lesson_47.Cat> cats = getListCats();

        // Получить список имен всех кошек
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(lesson_47.Cat::getName)
                .collect(Collectors.toList());

        System.out.println("catNames: " + catNames);

        // Изначальная коллекция (источник данных для потока) не изменяется
        System.out.println(cats);


//        List<String> listNames = new ArrayList<>();
//        for (Cat cat : cats) {
//            listNames.add(cat.getName());
//        }
    }

    private static void task3() {
        List<lesson_47.Cat> cats = getListCats();

        // Список котов с именем длиннее 4 символов
        Stream<lesson_47.Cat> stream = cats.stream()
                .filter(c -> c.getName().length() > 4);

        // Пока не запущен терминальный метод - промежуточные операции не выполняются
        List<lesson_47.Cat> longNames = stream.collect(Collectors.toList());

        System.out.println("longNames: " + longNames);

    }

    private static List<Cat> getListCats() {
        return List.of(
                new lesson_47.Cat("Bear", 5, "braun"),
                new lesson_47.Cat("Python", 7, "green"),
                new lesson_47.Cat("Tiger", 3, "yellow"),
                new lesson_47.Cat("Panda", 4, "black")
        );
    }

    private static void task2() {
        List<lesson_47.Cat> cats = getListCats();

        // список кошек с весом больше 4
        Stream<lesson_47.Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод
        List<Cat> fatCats = catStream.collect(Collectors.toList());
//        List<Cat> fatCats = catStream.toList(); // Java 17 or higher .collect(Collectors.toList() = .toList();

        System.out.println("fatCats: " + fatCats);

        // Повторно использовать "закрытый" поток нельзя. Закрытый - поток, на котором уже был вызван терминальный метод
//        List<Cat> catList2 = catStream.sorted().collect(Collectors.toList()); // будет ошибка (исключение)

    }


    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 99);

        // Получить список, содержащий все положительный числа из исходного списка
        // Список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();

        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }

        result.sort(Comparator.naturalOrder());

        System.out.println("result: " + result);

        // У всех коллекций есть метод .stream() создающий поток (стрим) из элементов коллекции.

        List<Integer> integerList = integers.stream() // создание потока из элементов коллекции List
                .filter(e -> e > 0) // фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию List

        System.out.println("list: " + integerList);
    }


}