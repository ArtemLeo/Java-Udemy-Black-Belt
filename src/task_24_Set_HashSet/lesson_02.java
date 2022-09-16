package task_24_Set_HashSet;

import java.util.HashSet;

public class lesson_02 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);
        System.out.println(hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);
        System.out.println(hashSet2);

        // addAll (union) - объединение 2-х множеств ;
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        // intersect - нахождение/вывод на экран только элементов с дубликатами;
        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        // subtract - удаление из hashSet1 всех элементов hashSet2 (останутся уникальные элементы hashSet1);
        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);

    }
}
