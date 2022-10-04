package task_36_Predicate_java_util_function;

import task_35_Lambda_expressions.lesson_02.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudent(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student s : arrayList) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Zoe", 'f', 21, 2, 9.8);
        Student st3 = new Student("Tom", 'm', 23, 4, 7.2);
        Student st4 = new Student("Den", 'm', 21, 2, 8.1);
        Student st5 = new Student("Anna", 'f', 23, 4, 8.9);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);

        /*
        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        info.testStudent(students, p1.and(p2));
        info.testStudent(students, p1.or(p2));
        info.testStudent(students, p1.negate(p2));
         */

    }
}
