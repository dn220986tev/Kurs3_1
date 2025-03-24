
package lesson_25;

public class StaticBlockDemo {
    static int counter = 5;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10; // Инициализация значения

    // Статический блок инициализации
    // В нем могут быть проинициализированы статические поля класса (присвоение начальных значений статике)
    // Вызывается ровно один раз в момент загрузки класса в JVM (до вызова конструктора)
    static {
        System.out.println("Static Block RUN");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }

    // НЕ статические блоки инициализации.
    // Выполняются при КАЖДОМ создании объекта.
    // Вызывается до конструктора
    {
        System.out.println("NON-static block RUN!");
        if (counter == 0) {
            this.capacity = 50;
        }
        title = "Default";
    }


    // Конструктор
    public StaticBlockDemo() {
        System.out.println("Constructor RUN!");
//        if (counter == 0) {
//            this.capacity = 50;
//        }

//        colors[0] = "red";
//        colors[1] = "green";
//        colors[2] = "yellow";
    }

    // конструктор 2
    public StaticBlockDemo(String title) {
        System.out.println("Constructor 2 RUN!");
//        if (counter == 0) {
//            this.capacity = 50;
//        }

        this.title = title;
    }

    public String toString() {
        return String.format("Title: %s, capacity: %d, static-counter: %d",
                title, capacity, counter);
    }
}
