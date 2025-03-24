package lesson_34.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUP() {
        person = new Person(startEmail, startPassword);
    }

    /*
    1. Беру валидный email
    2. Устанавливаем его сеттером person-у
    3. Мы ожидаем: что у person в поле email будет значение, которое мы установили в шаге 2
     */

    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test111@test.com.de", })
    void testValidEmailSet(String validEmail) {

        person.setEmail(validEmail);

        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    1. Берем НЕ валидный email
    2. Устанавливаем его сеттером
    3. Ожидаемый результат: Email установлен не будет
        3.1. поле email у person НЕ будет равно "не валидный email"
        3.2. Значение поля email должно остаться прежним
     */



}