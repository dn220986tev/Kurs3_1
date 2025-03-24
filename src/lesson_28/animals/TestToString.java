package lesson_28.animals;

public class TestToString {
    private String title;

    public TestToString(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestClass: " + title;
    }

    public static void main(String[] args) {
        TestToString test = new TestToString("test");
/*
        У всех классов есть родитель Object ->
        -> у объекта любого класса есть метод toString (полученный от Object)
        -> когда мы передаем ссылку на объект в место, где она должна быть преобразована в строку
        (sout или конкатенация String + ссылка)
        у объекта будет вызван метод .toString()
 */
        System.out.println(test);


        String result = "Hello, " + test;

        System.out.println(result);

    }
}
