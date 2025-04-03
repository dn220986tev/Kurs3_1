package lesson_43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class CollectionExample {
    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов (List, Queue, Set)
        // Это позволяет нам единообразно обрабатывать различные типы коллекций.

        // Создаем коллекцию строк
        // Ссылка типа интерфейс -> набор доступных методов + ссылку на объект какого класса может хранить эта переменная.
        // Справа мы можем подставить объекты разных классов (получить разные реализации этого интерфейса)
        Collection<String> strings = new HashSet<>();
        strings = new ArrayList<>();

        // int size() - возвращает кол-во элементов в коллекции
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает true, если коллекция пуста
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean add(T t) - добавляет элемент в коллекцию
        strings.add("Java");
        System.out.println("strings.add(\"Python\") :" + strings.add("Python"));

        // Переопределенный метод toString для красивого вывода элементов коллекции
        System.out.println(strings);

        // Статический метод .of() - метод в нескольких интерфейсах м классах JFC
        // Был введен в Java 9 (SDK 9 и выше)
        // Создает неизменяемую (нельзя удалить или добавить элементы) коллекцию из предоставленных элементов
        // Доступен для List, Set, Map

        Collection<Integer> integers = List.of(0, 1, 2, 3, 5, 6);
        System.out.println("integers: " + integers);
        // integers.add(7); // попытка модифицировать (изменить) неизменяемую коллекцию приведет к ошибке (Исключительная ситуация)

//        strings.add("JS");
//        strings.add("Go Land");
//        strings.add("Ruby");

        // Методы addAll, removeAll, retainAll - это программная реализация операций над множествами в математике

        // addAll(Collection<? extends T> col) - добавит все элементы из указанной коллекции - СЛОЖЕНИЕ
        strings.addAll(List.of("JS", "Go Land", "Ruby", "Kotlin"));

        System.out.println(strings);

        System.out.println("\n=========================\n");

        // removeAll(Collection<?> colB) - удаляет все элементы содержащиеся в коллекции colB из коллекции на которой вызван метод
        // colA.removeAll(colB) - Удаляет из А все элементы, которые содержит кол B (ВЫЧИТАНИЕ)
        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 2));

        colA.removeAll(List.of(3, 2, 1, 10));
        System.out.println(" colA.removeAll(List.of(3, 2, 1)): " + colA);

        // Пересечение
        // retainAll(Collection<?> colB) - Оставляет в коллекции вызова только те элементы, которые содержаться в коллекции B.
        // Удаляет из коллекции вызова элементы, которые НЕ содержаться в коллекции B
        // colA.retainAll(colB) - оставляет в А только те элементы, которые также есть в B.

        colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50, 60));
        colB.addAll(List.of(20, 30, 40, 100));
        System.out.println("ColA: " + colA);
        System.out.println("ColB: " + colB);
        colA.retainAll(colB);
//        colB.retainAll(colA);
        System.out.println("colA.retainAll(colB): " + colA);
//        System.out.println("colB.retainAll(colA): " + colB);

        // boolean containsAll(Collection<?> c): возвращает true, если коллекция содержит все элементы из указанной коллекции.
        System.out.println("colA.containsAll(List.of(20, 30): " + colA.containsAll(List.of(20, 30))); // true


        // boolean remove(Object obj) - удаляет элемент из коллекции. Вернет true, если элемент был удален
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println(colA.remove(20)); // Ужалит одно значение (даже если элементов с таким значение несколько
        // Если нужно удалить все вхождения colA.removeAll(List.of(20));
        System.out.println(colA);

        // clear() - удаляет все элементы из коллекции
        colA.clear();
        System.out.println("colA: " + colA);




    }
}
