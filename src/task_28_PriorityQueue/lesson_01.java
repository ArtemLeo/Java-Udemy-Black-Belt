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
        // Естественная сортировка: 1,4,7,8,10

        // peek - находит/выводит на экран первый элемент в PriorityQueue. Если элементов нет - ошибку НЕ выбрасывает (null);
        System.out.println(priorityQueue.peek());

        // remove - удаляется элемент с высшим приоритетом;
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }
}
