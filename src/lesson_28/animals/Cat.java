package lesson_28.animals;


public class Cat extends Animal {

    // Уникальный функционал кота
    public void eat() {
        System.out.println("Cat eat");
    }

    // Переопределение родительского метода voice()
    @Override // Аннотация, указывает, что метод переопределяет родительский метод
    public void voice() {
        System.out.println("Cat say MEOW!");
    }

}