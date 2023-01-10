package Java_57_Multithreading;

public class With_MainThread extends Thread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new With_MainThread());
        thread1.start();
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

