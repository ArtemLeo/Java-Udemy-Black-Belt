package task_13_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class lesson_02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Tom");
        arrayList1.add("Anna");
        arrayList1.add("Den");

        Iterator<String> iterator = arrayList1.iterator();

        // Iterator (удаление элемента)
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}


