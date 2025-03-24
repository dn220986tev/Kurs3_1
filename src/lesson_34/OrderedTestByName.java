package lesson_34;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.03.2025
 */

// Тесты будут выполняться по алфавитному порядку названий тестовых методов
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedTestByName {

    @Test
    void testB() {
        System.out.println("testB");
    }

    @Test
    void testA() {
        System.out.println("testA");
    }

    @Test
    void testZ() {
        System.out.println("testZ");
    }

    @Test
    void testL() {
        System.out.println("testL");
    }
}