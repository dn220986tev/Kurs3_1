package lesson_35.equlas;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee employee = new Employee("Петр", "Петров", "21.10.2000");
        Employee employee1 = new Employee("Петр", "Иванов", "05.12.1990");
        Employee employee2 = new Employee("Иван", "Иванов", "21.10.2000");
        Employee employee3 = new Employee("Петр", "Петров", "21.10.2000");
        Employee employeeDate = new Employee("Петр", "Петров", "01.01.2015");

        // Два способа сравнения объектов

        // Оператор == сравнивает ссылки, указывают ли две переменные на один и тот же объект в памяти
        System.out.println("employee == employee1: " + (employee == employee1)); // false
        System.out.println("employee == employee3: " + (employee == employee3)); // false

        // Метод equals - логическое сравнение объектов по их содержимому (сравнение по значению)

        System.out.println("employee.equals(employee1): " + employee.equals(employee1)); // false
        System.out.println("employee.equals(employee3): " + employee.equals(employee3)); // false до переопределения equals()
        System.out.println("employee.equals(employeeDate): " + employee.equals(employeeDate));


    }
}