package task_35_Lambda_expressions.lesson_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class lesson_01 {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 'm', 23, 3, 8.3);
        Student st2 = new Student("Anna", 'f', 22, 2, 9.4);
        Student st3 = new Student("Den", 'm', 24, 4, 7.6);
        Student st4 = new Student("Zoe", 'f', 21, 1, 9.1);
        Student st5 = new Student("Artem", 'm', 23, 3, 9.2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Student_Info info = new Student_Info();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course - s2.course;
            }
        });
        System.out.println(students);
        System.out.println(" ");

        // Lambda expressions;
        Collections.sort(students,(stud1,stud2)-> stud1.course - stud2.course);
        System.out.println(students);
        System.out.println(" ");


        info.printStudentOverGrade(students, 8);
        System.out.println("------------------------");
        info.printStudentUnderAge(students, 23);
        System.out.println("------------------------");
        info.printStudentMixCondition(students, 20, 7, 'm');
    }
}
