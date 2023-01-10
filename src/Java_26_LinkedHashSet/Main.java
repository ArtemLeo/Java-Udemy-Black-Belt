package Java_26_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(10);
        System.out.println(linkedHashSet);

        // remove
        linkedHashSet.remove(8);
        System.out.println(linkedHashSet);

        // contains
        System.out.println(linkedHashSet.contains(5));
        System.out.println(linkedHashSet.contains(8));
    }
}
