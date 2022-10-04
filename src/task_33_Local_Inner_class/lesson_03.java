package task_33_Local_Inner_class;

public class lesson_03 {
    public static void main(String[] args) {
        class Slojenie implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Slojenie slojenie = new Slojenie();
        System.out.println(slojenie.doOperation(5,3));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}