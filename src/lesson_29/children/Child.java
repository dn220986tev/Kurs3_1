package lesson_29.children;

public class Child extends Parent{

    // Скопировано из родителя
    // private String name;
    int age;

    // Если нет ни одного, будет добавлен конструктор вида:
//    public Child() {
//        // вызывается пустой конструктор родителя
//        super();
//    }

    public Child() {
        // сначала я ДОЛЖЕН создать объект родителя
        // super(); // Если я не вызвал конструктор родителя, будет добавлен вызов пустого конструктора родителя
        super("Default");
        this.age = 20;
    }

    public Child(String name, int age) {
        super(name);
        this.name = name;
        this.age = age;
    }

    // Я не могу переопределить final-метод в наследнике
//   @Override
//    void show() {
//        System.out.println("Another show!");
//    }
}
