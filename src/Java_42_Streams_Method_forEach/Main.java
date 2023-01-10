package Java_42_Streams_Method_forEach;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(element -> {
            element *= 2;
            System.out.println(element);
        });
        System.out.println("-----------------------------------");
        Arrays.stream(array).forEach(element -> System.out.println(element));
        System.out.println("-----------------------------------");

        //or
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("-----------------------------------");

        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}