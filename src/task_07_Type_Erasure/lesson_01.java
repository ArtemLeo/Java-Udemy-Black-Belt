package task_07_Type_Erasure;

public class lesson_01 {

    class Info<T> {
        private T value;

        public T getValue() {
            return value;
        }
    }
    // Информация о Generics стирается, поэтому оба метода ниже для JVM выглядят одинаково;
    // typeErasure (Info info);

    // public void typeErasure(Info<String> info) {
    // String s = info.getValue();
    // }


    public void typeErasure(Info<Integer> info) {
        Integer i = info.getValue();
    }

    class Parent {
        public void typeErasure(Info<String> info) {
            String s = info.getValue();
        }
    }

    // Наследование подобных методов при наследовании - приводит к ошибке;

    class Child extends Parent {
        // public void typeErasure(Info<Integer> info) {
        // Integer i = info.getValue();
        // }
    }
}