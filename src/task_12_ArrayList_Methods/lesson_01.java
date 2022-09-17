package task_12_ArrayList_Methods;

import java.util.ArrayList;

public class lesson_01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        
        // add
        arrayList1.add("Tom");
        arrayList1.add("Anna");
        arrayList1.add("Den");

        // add index - добавление через Index;
        arrayList1.add(1, "Max"); 

        System.out.println(arrayList1); 
        for (String x : arrayList1) {
            System.out.print(x + " ");
        }
        System.out.println(" ");

        // get
        System.out.println(arrayList1.get(2));
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println(" ");

        // set (замана)
        arrayList1.set(2,"Anton");
        System.out.println(arrayList1);

        // remove (удаление)
        arrayList1.remove(2);
        System.out.println(arrayList1);
    }
}
