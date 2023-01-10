package Java_59_Methods_sleep_and_join_Thread_states;

public class Method_Sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Let`s go!!!");
    }
}
