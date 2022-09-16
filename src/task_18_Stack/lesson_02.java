package task_18_Stack;

import java.util.Stack;

public class lesson_02 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push - ��������� ������� � ����� Stack;
        stack.push("Igor");
        stack.push("Anna");
        stack.push("Max");
        System.out.println(stack);

        // pop - ������� ��������� ������� Stack;
        System.out.println(stack.pop());
        System.out.println(stack);

        // peek - �������/������� �� ����� ��������� ������� Stack;
        System.out.println(stack.peek());

        // isEmpty - �������� �� ������� ��������� � Stack;
        while (!stack.isEmpty()){
            stack.pop();
            System.out.println(stack);
            if (stack.isEmpty()){
                break;
            }
        }
    }
}
