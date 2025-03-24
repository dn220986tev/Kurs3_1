package lesson_32.lesson_list;

public class TypeErasure <E> {
    private Object value;

    public TypeErasure(Object value) {
        this.value = value;
    }

    public Integer getValue() {
        return (Integer) value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    // Нельзя сделать перегруженный метод, отличающийся только типами параметров
    public void method(TypeErasure<Integer> typeErasure) {
        System.out.println(typeErasure);
    }

//    public void method(TypeErasure<String> tErasure) {
//        System.out.println(tErasure);
//    }

    public static void main(String[] args) {

        TypeErasure<Integer> t = new TypeErasure<>(5);
    }
}