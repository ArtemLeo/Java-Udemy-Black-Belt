package task_07_Type_Erasure;

public class lesson_01 {

    class Info<T> {
        private T value;

        public T getValue() {
            return value;
        }
    }
    // ���������� � Generics ���������, ������� ��� ������ ���� ��� JVM �������� ���������;
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

    // ������������ �������� ������� ��� ������������ - �������� � ������;

    class Child extends Parent {
        // public void typeErasure(Info<Integer> info) {
        // Integer i = info.getValue();
        // }
    }
}