package task_12_ArrayList_Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class lesson_03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Tom");
        arrayList1.add("Anna");
        arrayList1.add("Den");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        System.out.println(arrayList2);

        // addAll
        arrayList1.addAll(arrayList2); // ƒобавление All в конец массива;
        arrayList1.addAll(1, arrayList2); // ƒобавление по индексу;
        System.out.println(arrayList1);

        // clear
        arrayList1.clear();
        System.out.println(arrayList1);

        // indexOf принимает в параметры объект и возвращает его позицию. ≈сли не найден, то возвращает -1;
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Tom");
        arrayList3.add("Anna");
        arrayList3.add("Den");
        int index = arrayList3.indexOf("Tom");
        System.out.println(index);

        // contains (поиск элементов в массиве);
        System.out.println(arrayList3.contains("Anna"));

        // size (сколько елементов в массиве);
        System.out.println(arrayList3.size());

        // isEmpty (содержит ли массив элементы);
        System.out.println(arrayList3.isEmpty());

        // removeAll (”далит все повтор€ющиес€ элементы, в указанном массиве)
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);

        // retainAll (ќставит все повтор€ющиес€ элементы, в указанном массиве)
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

        // containsAll ("содержит все")
        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);

        // subList (фрагмент массива; с 1-го элемента по 2-й Ќ≈ включительно);
        List<String> myList = arrayList2.subList(0, 2);
        System.out.println(myList);

        // toArray
        Object[] array = arrayList1.toArray();
        for (Object j : array) {
            System.out.print(j + " ");
        }
        String[] array2 = arrayList1.toArray(new String[3]);
        for (String s : array2) {
            System.out.print(s + " ");
        }
        System.out.println(" ");

        // List.of (List измен€ть Ќ≈Ћ№«я);
        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);

        // List.copyOf (List измен€ть Ќ≈Ћ№«я);
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);


    }
}
