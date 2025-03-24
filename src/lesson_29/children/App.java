package lesson_29.children;

public class App {

    public static void main(String[] args) {

        Parent parent = new Parent("Name");

        System.out.println(parent.name);

        Child child = new Child();

        System.out.println(child.name);
        System.out.println(child.age);

        System.out.println("\n===========");
        Child child2 = new Child("Child", 100);

        System.out.println(child2.name);
        System.out.println(child2.age);

        child2.show();

    }
}
