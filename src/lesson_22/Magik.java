package lesson_22;

import java.util.Arrays;

public class Magik {
        int[] array;
        int cursor;

        // Методы, расширяющие функционал массива

        public Magik(){
        this.array = new int[10];
        }

        public Magik(int[] array){
            //  Todo Homework
        }
// Добавление в массив одного элемента
    void add(int value){

        // Проверка! Есть ли свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length){
            // Расширить внутренний массив перед добавлением нового значения
            expandArray();
            }

        array[cursor] = value;
        cursor++;
        }
    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем внутренний массив! Курсор = " + cursor);
    /*
        1. Создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // Shift + Alt + стрелки вверх / вниз | Mac: Shift + Opt + Стрелка

        // 1
        int[] newArray = new int[array.length * 2];
        //2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        // 3. Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
        }
    // Добавление в массив нескольких элементов
    void  add (int... numbers){
        // с numbers я могу обращаться точно также, как со ссылкой на массив int
//        System.out.println("Принял несколько int: " + numbers.length);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("У каждого инта есть индекс, как в массиве: " + numbers[0]);

        // перебираю все значение. Для каждого вызываю метод add()
        for (int i =0; i< numbers.length; i++){
            add(numbers[i]);
        }
    }

// Возвращает строковое представление массива
    // [5, 20, 45]
public String toString(){
            if (cursor ==0) return "[]";
            String result = "[";
            for (int i = 0; i< cursor; i++){
                result += array[i] + (i< cursor - 1? ", " : "]");
            }
            return  result;

}

    // Текущее кол-во элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        // Проконтролировать входящий индекс!

        if (index >= 0 && index < cursor) {
            return array[index];
        }

        // Fixme Указать место в коде с ошибкой / проблей

        // Код, если индекс не корректный
        // Хорошего решения нет
        return -2_147_483_647;
        // Todo Поправить обработку некорректного индекса
    }

    // Удалить элемент по индексу. Вернуть старое значение

    int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
         */

        if (index >= 0 && index < cursor) {
            // Логика удаления
            int value = array[index]; // запомнить старое значение

            // Перебираем элементы начиная с индекса и перезаписываем значением из ячейки справа
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов
                array[i] = array[i + 1];
            }

            cursor--;

            return value; // вернуть старое значение

        } else {
            // Индекс не валидный
            // Todo поправить возвращаемое значение
            return -2_147_483_647;
        }

    }

    // Поиск по значению.
    // {1, 100, 5, 24, 0, 5} -> indexOf(5) = 2; indexOf(50) = -1;
    int indexOf(int value) {
        // Перебираю все значимые элементы.
        // Если элемент равен искомому - вернуть индекс такого элемента
        // Если перебрал все элементы =- не нашел совпадений - вернуть -1

        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                // Значения совпали. Возвращаю индекс
                return i;
            }
        }

        // Сюда мы попадем, если ни одно значение в массиве не совпало
        return  -1;
    }

    // Индекс последнего вхождения.
    // {1, 100, 5, 100, 24, 0, 100} -> lastIndexOf(100) -> 6
    int lastIndexOf(int value) {
        // Todo Homework
        return -1;
    }

    // Удаление элемента по значению
    boolean removeByValue(int value) {
        // Todo Homework
        return false;
    }

    //  // {1, 100, 5, 100, 24, 0, 100}
//    int[] findAllValues(int value) {
//       // {1, 3, 6}
//        return null;
//    }





    void test() {
        System.out.println(Arrays.toString(array));
    }

}