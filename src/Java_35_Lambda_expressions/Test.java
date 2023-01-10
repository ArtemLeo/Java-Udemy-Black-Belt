package Java_35_Lambda_expressions;

public class Test {
    static void def(I i) {
        System.out.println(i.abs("Hello"));
    }

    public static void main(String[] args) {
        def((String s) -> {
            return s.length();
        });
        int x = 10;
        def((String s) -> {
            return s.length() + x;
        });
    }
}

interface I {
    int abs(String s);
}
