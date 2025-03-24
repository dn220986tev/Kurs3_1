package lesson_22;

public class lesson22Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("В numbers ячеек: " + numbers.length);
Magik magic = new Magik();
        System.out.println(magic.toString());
        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(100);
        magic.add(100);
        magic.add(6, 7, 8);
        magic.add(10, 20, 30);


        System.out.println("В массиве сейчас элементов: " + magic.size());
        String arrayToString = magic.toString();
        System.out.println("arrayToString: " + arrayToString);
        System.out.print("Внутренний массив: ");
        magic.test();

        System.out.println("\n================");
        int value = magic.get(0);
        System.out.println("magic.get(0): " + value);

//        System.out.println("magic.get(15): " + magic.get(15));
//        System.out.println("magic.get(-1): " + magic.get(-1));
//        System.out.println("magic.get(30): " + magic.get(30));

        int oldValue = magic.remove(3);
        System.out.println("magic.remove(3): " + oldValue);
        System.out.println(magic.toString());
        System.out.println("size: " + magic.size());
//        System.out.print("Внутренний массив: ");
//        magic.test();
        // System.out.println(magic.remove(20));

        System.out.println("\n================");
        System.out.println("magic.indexOf(20): " + magic.indexOf(20));

        int index = magic.indexOf(500);
        System.out.println("magic.indexOf(500): " + index);

        if (index >= 0) {
            System.out.println("Значение было найдено");
        } else {
            System.out.println("Вернулся отрицательный индекс. Такое значения в массиве нет");
        }



    }
}