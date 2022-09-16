package task_29_Deque_ArrayDeque_LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class lesson_01 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // addFirst addLast - ���������� ��������� � ������/����� ArrayDeque (*����������� ������)
        // offerFirst offerLast - ���������� ��������� � ������/����� ArrayDeque (* �� ����������� ������)
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.addLast(8);
        System.out.println(deque);
        System.out.println(" ");

        // getFirst getLast - �����/������� �� ����� �������� � ������/����� ArrayDeque (*����������� ������)
        // peekFirst peekLast - �����/������� �� ����� �������� � ������/����� ArrayDeque (* �� ����������� ������)
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(" ");

        // removeFirst removeLast - �������� ��������� � ������/����� ArrayDeque (*����������� ������)
        // pollFirst pollLast - �������� ��������� � ������/����� ArrayDeque (* �� ����������� ������)
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);


    }
}
