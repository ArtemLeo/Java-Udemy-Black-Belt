package task_35_Lambda_expressions.lesson_02;

import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Anna", 'f', 23, 3, 8.3);
        Student st2 = new Student("Den", 'm', 22, 2, 9.4);
        Student st3 = new Student("Zoe", 'f', 24, 4, 7.6);
        Student st4 = new Student("Artem", 'm', 21, 1, 9.1);
        Student st5 = new Student("Ted", 'm', 23, 3, 9.2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());
        System.out.println("------------------------------");

        // Anonymous class;
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("---------------------------------");

        // Lambda expressions;
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });
        System.out.println("---------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("---------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
        });
        System.out.println("---------------------------------");


        // Lambda expressions (short);
        info.testStudents(students, (Student s) -> {return s.avgGrade > 8;});  // Lambda (long);
        info.testStudents(students, s -> s.avgGrade > 8);                      // Lambda (short);

        // Присваивание переменной значение лямбда-выражения;
        StudentChecks sc = (Student s) -> {return s.avgGrade > 8;};
        info.testStudents(students, sc);
    }
}
