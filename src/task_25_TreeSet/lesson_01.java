package task_25_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class lesson_01 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
       // treeSet.add(null); treeSet НЕ хранит значения null;
        System.out.println(treeSet);

        // remove
        treeSet.remove(2);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(1));
    }
}
