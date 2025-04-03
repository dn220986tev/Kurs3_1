package lesson_46.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(10, "Peter", 25));
        users.add(new User(5, "Max", 18));
    }

    public static void main(String[] args) {

        // Optional<T> это класс-обертка, который может содержать значение типа T, а может не содержать (быть пустым)

        // Основная задача - уменьшить кол-во ошибок, возникающий при обращении к null



        Optional<User> optUser = getById2(10);

//        System.out.println(optUser.get());



        // boolean isPresent() - Мы можем проверить, есть ли в обертке значение
        if (optUser.isPresent()) {
            // Метод get() - позволяет получить значение, завернутое в Optional
            // если вызвать его на пустом (содержащем null) - получим ошибку
            User user = optUser.get();
            System.out.println("user: " + user);
            System.out.println("Имя: " + user.getName());
        } else {
            System.out.println("Пользователь не найден");
        }

        // boolean isEmpty - вернет true, если Optional пустой

        // orElse(T defaultValue) - распакует из Optional объект, если он есть
        // или вернет значение по умолчанию
        User current = getById(10).orElse(null);
        System.out.println("getById(1).orElse(null): " + current);

        // NPE
//        System.out.println(user.getName());



    }

    /*
    Как создать Optional
    Optional.of(value) - создает Optional, содержащий значение. (не пустой / не null)
    Если передать null - будет ошибка

    Optional.empty() - создает пустой Optional.

    Optional.ofNullable(value) - создает оптионал, который содержит значение или пустой
     */

    // Обертка указывает на необходимость проверки на null
    public static Optional<User> getById(int id) {
        // Список пользователей.
        // Перебираем пользователей, сравниваем id
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }

    public static Optional<User> getById2(int id) {
        // Список пользователей.
        // Перебираем пользователей, сравниваем id
        User result = null;

        for (User user : users) {
            if (user.getId() == id) {
                result = user;
            }
        }

        return Optional.ofNullable(result);
    }
}