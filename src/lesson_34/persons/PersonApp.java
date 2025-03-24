package lesson_34.persons;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@mailne.t", "qqqwerty1!");

        person.setEmail("test@ma1.1il.net");

        System.out.println(person);

        person.setPassword("QWE4RTYqwwe%");
        System.out.println(person);




    }
}