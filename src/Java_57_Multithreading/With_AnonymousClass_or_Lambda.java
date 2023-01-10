package Java_57_Multithreading;

public class With_AnonymousClass_or_Lambda {
    public static void main(String[] args) {

        // Быстрый способ создания потока с помощью анонимного класса;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        // Быстрый способ создания потока с помощью лямбда-выражения;
        new Thread(()-> System.out.println("hello")).start();
    }
}
