package task_24_Set_HashSet;

import java.util.HashSet;
import java.util.Set;

public class lesson_01 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Tom");
        hashSet.add("Artem");
        hashSet.add("Anna");
        hashSet.add("Den");
        //hashSet.add("Den"); Set - не поддерживает дубликаты;
        System.out.println(hashSet);

        for (String s : hashSet){
            System.out.println(s);
        }
        
        // remove
        hashSet.remove("Den");
        System.out.println(hashSet);

        // size
        System.out.println(hashSet.size());

        // isEmpty
        System.out.println(hashSet.isEmpty());

        // contains - поиск элемент (true/false)
        System.out.println(hashSet.contains("Tom"));
    }
}
