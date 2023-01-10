package Java_36_Predicate_java_util_function;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Bye");
        arrayList.add("Ok");
        arrayList.add("Java");
        arrayList.add("Lambda");

        arrayList.removeIf(element -> element.length() < 5);
        System.out.println(arrayList);
        // or
        Predicate<String> p = element -> element.length() < 5;
        arrayList.removeIf(p);
        System.out.println(arrayList);
    }
}
