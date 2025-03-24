package lesson_28.animals;


public class Dog extends Animal {


    @Override
    public void voice() {
        // обращение к объекту родителя и вызов его реализации метода voice
        super.voice();
    }

    @Override
    public String toString() {
        return super.toString() + " | Dog. Дополнение реализации родительского метода";
    }
}
