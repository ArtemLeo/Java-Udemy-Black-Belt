package task_16_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class lesson_01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // ����� �������� ����� Collections.binarySearch;
        int index = Collections.binarySearch(arrayList, 12);
        System.out.println(index);
        // ���� ����� � ������� �� �������, �� ��������� ������������� ����� (�������� "-9");

        // ����� reverse;
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        // ������������� (shuffle);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}

