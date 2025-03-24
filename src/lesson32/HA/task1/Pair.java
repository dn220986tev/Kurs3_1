package lesson32.HA.task1;

/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.

Требования:

Класс должен иметь конструктор, принимающий два параметра типа T.

Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
 */

public class Pair <E> {
    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public void swap() {
        E temp = first;
        first = second;
        second = temp;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair {" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "Java");
        System.out.println(pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();
        System.out.println(pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}