package lesson_43;

import java.util.*;


public class ListExample {

    public static void main(String[] args) {

        // Конструкторы

        // Конструкторы ArrayList

        List<Integer> list = new ArrayList<>(); // Создает пустой список (с начальной емкостью 10 элементов)
        list = new ArrayList<>(50); // Пустой список с указанной емкостью
        // Создает список, содержащий все элементы указанной коллекции (копирование элементов из другой коллекции)
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100)); // Принимает коллекцию

        // Конструкторы LinkedList
        list = new LinkedList<>(); // Создает пустой список (внутрення реализация - двусвязный список)
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100)); // Создает список, содержащий все элементы указанной коллекции

        // Методы интерфейса List

        // boolean add (E e) - добавляет элемент в конец списка
        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        // void add(int index, E element) - добавляет элемент на указанную позицию (перед индексом index)
        list.add(3, 500);

        System.out.println("list: " + list);


        // E get(int index) - возвращает элемент по индексу
        int value = list.get(5);
        System.out.println("value: " + value);


        // E remove(int index) - удаляет элемент по индексу, возвращает старое значение
        System.out.println("list.remove(5): " + list.remove(5));
        System.out.println(list);

        // boolean remove(Object o) - метод удаления по значению (из интерфейса Collection) - принимает ссылочный тип данных
        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println(list.remove("String"));
        System.out.println(list);

        // Поиск элемента по значению - возвращает индекс
        // int indexOf(Object obj) - первое вхождение
        // int lastIndexOf(Object obj) - последнее вхождение

        System.out.println("list.indexOf(4000): " + list.indexOf(4000)); // -1 - значение не найдено
        System.out.println("list.indexOf(-100): " + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100): " + list.lastIndexOf(-100));

        System.out.println("=================== sort =============== \n");

        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора

        list.sort((i1, i2) -> Integer.compare(i2, i1));
        list.sort(Comparator.reverseOrder());

        System.out.println(list);

        list.sort(Integer::compareTo);
        list.sort(Comparator.naturalOrder());

        System.out.println(list);

        // List<E> subList(int idxFrom, int idxTo) - возвращает список из элементов,
        // находящихся на позициях от idxFrom (включительно) до idxTo (не включительно)
        List<Integer> subList = list.subList(1, 5);
        System.out.println("subList(1, 5): " + subList);


        System.out.println("==========================\n");
        Deque<Integer> deque = new LinkedList<>();





    }
}