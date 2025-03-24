package Lesson_23;

public class Cat {
    private String name;
    private int age;
    private int weight;
    protected boolean isProtected;
    boolean isDefault;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры и сеттеры - специальные публичные методы, дающие возможность
    // получать или изменять значение поля

    // Геттер для поля age
    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    // Сеттеры
    public void setAge(int age) {
        // 20 (20 < 0 || 2- > 30 -> false -> !false -> true
        //   !(age < 0 || age > 30) => !(age < 0) И !(age> 30)
        // Если возраст НЕ меньше 0 и НЕ больше 30), то делай код 1. Иначе - делай код 2

        if (!(age < 0 || age > 30)) {
            // Если age подходит. (изначальное условие выдает false),
            // которое мы инвертируем оператор ! в true
            this.age = age;
        }

        // 2 * ( a + b) -> 2a + 2b

        /*
        if ((age < 0 || age > 30)) {
           // age не подходит (условие выдает true)
        } else {
            //age подходит. Условие выдает false
            this.age = age;
        }
         */

        /*
        if (age < 0 || age > 30) {
            // пусто. Возраст не подходит - ничего не делаю
            return;
        }
        this.age = age;
         */
    }

    public void setWeight(int weight) {
        // Имеем возможность проверить входящее значение
        if (weight < 0) {
            // Если входящее не устраивает - я могу установить "значение по умолчанию"
            this.weight = 0;
            System.out.println("Текущий вес кота: " + this.weight);
            return; // работа метода прекращается. Дальнейшие проверки не проводятся
        }
        // В эту строку кода мы попадем с значением weight 0 больше
        // Если вес НЕ больше 50 кг - то делай блок кода 1. Иначе, делай код 2
        // -5 > 50 ? !false = true
        if ( !(weight > 50)) {
            // код1
            this.weight = weight; //
        }
        // Иначе ничего не делаем = оставляем старое значение
    }

    // Я не хочу давать возможность изменять имя коту после создания объекта -
    // поэтому в классе не пишу сеттер на имя
    /*
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
     */


    public void sayMeow() {
        System.out.println("Meow! " + name);
        testMethod(); // внутри кода класса у меня есть доступ к приватным членам (в том числе методам)
    }

    private void testMethod() {
        System.out.println("Test!");
    }

    public String toString() {
//        System.out.printf("Cat %s, age: %d, weight: %d\n", name, age, weight);
//        String resConcat = "Cat " + name + ", age: " + age + " weight: " + weight;
        String result = String.format("Cat %s, age: %d, weight: %d", name, age, weight);
        return result;
    }
}
