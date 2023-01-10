package Java_62_Monitor_Synchronized_blocks;

public class SynchronizedBlocks_01 {
    public static void main(String[] args) {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread tread1 = new Thread(runnable);
        Thread tread2 = new Thread(runnable);
        Thread tread3 = new Thread(runnable);
        tread1.start();
        tread2.start();
        tread3.start();
    }
}

class Counter {
    volatile static int count = 0;
}

class MyRunnableImpl1 implements Runnable {

    private void doWork2(){
        System.out.println("Yahoo");
    }
    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}