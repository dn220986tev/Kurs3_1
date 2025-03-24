package lesson_29.abstracts;

/*
Абстрактные классы позволяют определить шаблон для группы связанных классов.

1. Нельзя создать объект абстрактного класса.
2. Могут содержать абстрактные методы.
Абстрактный метод - это метод без реализации (только объявление метода)
3. Абстрактные классы могут также содержать и полностью реализованные методы
4. Если в классе есть хотя бы один абстрактный метод, класс ДОЛЖЕН быть абстрактным
5. Могут содержать поля и конструкторы так же, как обычные "классы"



 */

public abstract class Animal {

    private String name;

    public Animal() {
        this.name = "Animal";
    }

    public Animal(String name) {
        this.name = name;
    }

    //Абстрактный метод не имеет реализации (тела метода)
    abstract void move();
    abstract void eat();

    // в абстрактном классе могут присутствовать "обычные" методы с реализацией.
    public void sayHello(){
        System.out.println("Hello from animal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
