package task_01_Collections_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lesson_01 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Ivan");
        list.add("Anna");
        System.out.println("Before sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sort");
        System.out.println(list);



    }
}
