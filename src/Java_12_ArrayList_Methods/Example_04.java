package Java_12_ArrayList_Methods;

import java.util.Arrays;
import java.util.List;

public class Example_04 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        // asList (получаем ArrayList из массива, которые будут связаны);
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List <StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

        // append (добавление к элементу, по индексу);
        array[0].append("!!!");
        System.out.println(list);
    }
}
