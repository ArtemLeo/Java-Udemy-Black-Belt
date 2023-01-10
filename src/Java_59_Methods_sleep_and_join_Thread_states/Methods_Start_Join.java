package Java_59_Methods_sleep_and_join_Thread_states;

public class Methods_Start_Join {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());

        System.out.println(thread.getState()); // Состояние потока NEW;
        thread.start();
        System.out.println(thread.getState()); // Состояние потока RUNNABLE;
        thread.join();
        System.out.println(thread.getState()); // Состояние потока TERMINATED;
        System.out.println("Method main ends");
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends");
    }
}
