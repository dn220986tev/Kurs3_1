package lesson_26;

import java.util.Arrays;

public class StringBuilderExample {

    public static void main(String[] args) {

        String str = "Java" + " " + "is" + " " + "the" + " " + "best";

        // StringBuilder - это класс, который используется для создания и манипулирования
        // изменяемыми строками.

        // Перегруженный конструктор. Может быть пустым, может принимать String
        StringBuilder sb = new StringBuilder(); // пустой конструктор
        sb = new StringBuilder("Hello");

        // Метод для добавления символов в конец строки (приклеивание справа). Аналог конкатенации.
        sb.append(" "); // "Hello" + " ";

        // Получить строковое представление
        String string = sb.toString();
        System.out.println(string);


        // Вставить символы в указанную позицию
        sb = new StringBuilder("Hello World"); // Hello beautiful World
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString());
//        String start = "Hello World";
//        String result = start.substring(0, 6);
//        result +=  "beautiful ";
//        result += start.substring(6);
//        System.out.println(result);

        // Заменить подстроку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hello World!"); // "Hello Java"
        sb.replace(6, 11, "Java"); // Заменить мне все что было с 6 по 11 индекс на "значение". Верхня граница не включительно
        System.out.println(sb.toString());

        // Удалить подстроку в диапазоне от start (вкл) до end (не вкл)
        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());

        System.out.println("\n========== index ==========");

        // Нам надо знать есть ли в sb какая-то подстрока. Положительный индекс, если нашел. И минус 1, если подстрока не найдена
        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("W");
        System.out.println(index);
        index = sb.lastIndexOf("Java");
        System.out.println(index);

        System.out.println("\n========== reverse ==========");

        // Реверс - Разворачивает последовательность символов
        sb = new StringBuilder("Hello World!"); // !dlroW olleH
        sb.reverse();
        System.out.println(sb.toString());

        // Получить символ по индексу
        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(3);
        System.out.println(ch);

        // количество символов в sb (длина)
        System.out.println("length: " +  sb.length());

        // Я могу установить новую длину (обрезать или расширить sb)
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку, она будет заполнена char с кодом 0
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8) code: " + (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb.toString());
        System.out.println("sb.length(): " + sb.length());

        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из несколько слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)
        научно исследовательский институт -> НИИ
         */

        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] words = example.split(" "); // Метод класса String. Результат - массив строк
        System.out.println(Arrays.toString(words));

        String str1 = "fstgws gqtgtwr";
        // получить массив символов, из которых состоит строка
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));









    }
}


