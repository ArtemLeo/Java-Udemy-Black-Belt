package task_35_Lambda_expressions.lesson_02;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> arrayList, StudentChecks sc) {
        for (Student s : arrayList) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}
