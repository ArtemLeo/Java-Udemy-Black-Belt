package task_08_Subtyping;

import java.util.ArrayList;
import java.util.List;

public class lesson_01 {
    public static void main(String[] args) {

        // �������� ������� ����� ������������ �����;
        X x = new Y();

        // ��� Generics ��� ����������� ����������� - ����� ������;
        // List<X> list = new ArrayList<>(Y);
    }
}

class X {
}

class Y extends X {
}

// ����������� ��� �������� Placeholder <T extends Number>;

class Info<T extends Number> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

// ��� ������������������� �������, ����������� ���� ��������;

class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

// ������������� ����������� � ������������������� ������, ��������� ����� "&";
// class Info<T extends Number&Interface1&Interface2>