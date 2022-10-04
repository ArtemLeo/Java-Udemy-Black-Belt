package task_39_Function_java_util_function;

import task_35_Lambda_expressions.lesson_02.Student;

import java.awt.*;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;

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
        Student st1 = new Student("Ilona", 'm', 22, 3, 8.3);
        Student st2 = new Student("Tom", 'f', 21, 2, 9.8);
        Student st3 = new Student("Den", 'm', 23, 4, 7.2);
        Student st4 = new Student("Anna", 'm', 21, 2, 8.1);
        Student st5 = new Student("Ilya", 'f', 23, 4, 8.9);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);

        // Arithmetic mean of marks of all students (method apply);

        /*
        Function<Student, Double> function = student -> avgGrade;
        double res = avgSomething(students,student -> student.avgGrade);
        System.out.println(res);
         */
    }

   /*
   private static double avgSomething(List<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (String st : list) {
            result += function.apply(st);
        }
        result = result / list.size();
        return result;
    }
    */
}
