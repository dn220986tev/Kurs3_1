package lesson43.HA;

import java.util.*;


public class CompareListsWorkTime {
    private static final int CAPACITY = 150_000;
    private static final int BOUND = 5_000;
    private static final int INSERT_COUNT = 20_000;
    private static final int INSERT_BOUND = 10_000;


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < CAPACITY; i++) {
            int value = random.nextInt(BOUND + 1);
            arrayList.add(value);
            linkedList.add(value);
        }

        System.out.println("array size: " + arrayList.size());
        System.out.println("linked size: " + linkedList.size());

        long start = System.currentTimeMillis();
        arrayList.contains(200_000);
        long end = System.currentTimeMillis();
        System.out.println("Time array contains: " + (end - start));

        start = System.currentTimeMillis();
        linkedList.contains(200_000);
        end = System.currentTimeMillis();
        System.out.println("Time linked contains: " + (end - start));

        System.out.println("\n======================\n");

        start = System.currentTimeMillis();

        System.out.println("get array: " + getElements(arrayList));
        System.out.println("insert array: " + insertElements(arrayList));
        System.out.println("deleteByIndex array: " + deleteElementsByIndex(arrayList));
        System.out.println("deleteByValue array: " + deleteElementsByValue(arrayList));
        System.out.println("deleteByValue OPT2 array: " + deleteElementsByValueIterator(arrayList));

        end = System.currentTimeMillis();

        System.out.println("\nОбщее время выполнения для ArrayList: " + (end - start));

        System.out.println("\n ============================= \n");

        start = System.currentTimeMillis();

        System.out.println("get linked: " + getElements(linkedList));
        System.out.println("insert linked: " + insertElements(linkedList));
        System.out.println("deleteByIndex linked: " + deleteElementsByIndex(linkedList));
        System.out.println("deleteByValue linked: " + deleteElementsByValue(linkedList));
        System.out.println("deleteByValue OPT2 linked: " + deleteElementsByValueIterator(linkedList));

        end = System.currentTimeMillis();

        System.out.println("\nОбщее время выполнения для LinkedList: " + (end - start));


    }

    // вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
    public static long insertElements(List<Integer> integers) {
        long start = System.currentTimeMillis();

        Random random = new Random();

        for (int i = 0; i < INSERT_COUNT; i++) {
            integers.add(random.nextInt(integers.size()), random.nextInt(BOUND + 1));
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    // Получение всех элементов
    public static long getElements(List<Integer> integers) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    // удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
    public static long deleteElementsByIndex(List<Integer> integers) {
        long start = System.currentTimeMillis();

        Random random = new Random();

        for (int i = 0; i < INSERT_COUNT; i++) {
            integers.remove(random.nextInt(integers.size()));
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    //    1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
    public static long deleteElementsByValue(List<Integer> integers) {
        long start = System.currentTimeMillis();

        Random random = new Random();

        for (int i = 0; i < INSERT_COUNT; i++) {
            integers.remove(Integer.valueOf(random.nextInt(INSERT_BOUND + 1)));
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long deleteElementsByValueIterator(List<Integer> integers) {
        long start = System.currentTimeMillis();

        Random random = new Random();

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            if (Objects.equals(val, random.nextInt(INSERT_BOUND + 1))) {
                iterator.remove();
            }
        }


        long end = System.currentTimeMillis();
        return end - start;
    }





}