package lesson_30.interfaces;

// Интерфейс может расширять другой интерфейс
public interface ColorPrintable extends Printable {
    // дочерний интерфейс наследует все методы родительского интерфейса

    void colorPrint();

}