package task_11_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class lesson_01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Tom");
        arrayList1.add("Anna");
        arrayList1.add("Den");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200); // Capacity - вместимость ArrayList;
        arrayList2.add("Tom");
        arrayList2.add("Anna");
        System.out.println(arrayList2.size()); // Size - текущий размер ArrayList;

        List<String> arrayList3 = new ArrayList<>(); // Создание по иерархии - от List;

        List<String> arrayList4 = new ArrayList<>(arrayList1); // За элементы принимается другой ArrayList. Создаётся новый ArrayList;
        System.out.println(arrayList4);                       
    }
}
