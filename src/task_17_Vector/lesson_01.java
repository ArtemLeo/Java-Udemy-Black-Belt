package task_17_Vector;

import java.util.Vector;

public class lesson_01 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Tom");
        vector.add("Anna");
        vector.add("Den");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
