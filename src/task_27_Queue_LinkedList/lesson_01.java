package task_27_Queue_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class lesson_01 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Tom");
        queue.add("Den");
        queue.add("Anna");
        queue.add("Zoe");
        queue.add("Artem");
        System.out.println(queue);

        // add - ��������� ������� (����� � Queue ��� ��� ���������� �����) ����������� ������;
        // offer - ��������� ������� (����� � Queue ��� ��� ���������� �����) �� ����������� ������;
        queue.offer("Ben");
        System.out.println(queue);
        System.out.println(" ");

        // element - �������/������� �� ����� ������ ������� � Queue. ���� ��������� ��� - ����������� ������;
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(" ");

        // peek - �������/������� �� ����� ������ ������� � Queue. ���� ��������� ��� - ������ �� ����������� (null);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(" ");

        // remove - ���� �� ��������� ��� ��������, �� ��������� ������ �� ������� (FIFO). ���� ��������� ��� - ����������� ������;
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(" ");

        // poll - ������� ��������. ��� ���������� ��������� � Queue - ���������� null (�� ����������� ������);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
