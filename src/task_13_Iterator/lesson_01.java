package task_13_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class lesson_01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Tom");
        arrayList1.add("Anna");
        arrayList1.add("Den");

        Iterator<String> iterator = arrayList1.iterator();

        // Iterator (вывод на экран);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
