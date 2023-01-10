package Java_36_Predicate_java_util_function;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Student_Info {
    void testStudent(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student s : arrayList) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
