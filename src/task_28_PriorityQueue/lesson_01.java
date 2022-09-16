package task_28_PriorityQueue;

import java.util.PriorityQueue;

public class lesson_01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        System.out.println(priorityQueue);
        // ������������ ����������: 1,4,7,8,10

        // peek - �������/������� �� ����� ������ ������� � PriorityQueue. ���� ��������� ��� - ������ �� ����������� (null);
        System.out.println(priorityQueue.peek());

        // remove - ��������� ������� � ������ �����������;
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }
}
