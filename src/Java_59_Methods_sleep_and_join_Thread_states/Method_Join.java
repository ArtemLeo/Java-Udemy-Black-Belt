package Java_59_Methods_sleep_and_join_Thread_states;

public class Method_Join extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());    // Поток от интерфейса;
        Thread thread2 = new Thread(new Method_Join());    // Поток от класса;
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        System.out.println("-----------------------");
        thread1.start();
        thread2.start();

        // join;
        thread1.join();
        thread2.join();
        System.out.println("End!");
    }

}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
