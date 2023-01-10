package Java_62_Monitor_Synchronized_blocks;

public class SynchronizedBlocks_02 {
    static int counter = 0;

    public static void increment() {
        synchronized (SynchronizedBlocks_02.class) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Java_61_Data_race_Synchronized_methods.Main.increment();
        }
    }
}