package task_04_Generics;

import java.util.ArrayList;
import java.util.List;

public class lesson_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye");
        list.add("Hi");
        System.out.println(list);

        for (String x : list) {
            System.out.println(x);
        }
         /* Generics позвол€ют:
         - Type Safe: создавать коллекции определЄнных типов
         - Reusable Code: не создавать дубликат кода
         */

    }
}
