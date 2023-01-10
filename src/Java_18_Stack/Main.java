package Java_18_Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push - добавляет элемент в конец Stack;
        stack.push("Igor");
        stack.push("Anna");
        stack.push("Max");
        System.out.println(stack);

        // pop - удаляет последний элемент Stack;
        System.out.println(stack.pop());
        System.out.println(stack);

        // peek - находит/выводит на экран последний элемент Stack;
        System.out.println(stack.peek());

        // isEmpty - проверка на наличие элементов в Stack;
        while (!stack.isEmpty()){
            stack.pop();
            System.out.println(stack);
            if (stack.isEmpty()){
                break;
            }
        }
    }
}
