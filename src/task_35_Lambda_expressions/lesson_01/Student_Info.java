package task_35_Lambda_expressions.lesson_01;

import java.util.ArrayList;

public class Student_Info {

    void printStudentOverGrade(ArrayList<Student> al, double grade) {
        for (Student s : al) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
        for (Student s : al) {
            if (s.age > age && s.avgGrade > grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
