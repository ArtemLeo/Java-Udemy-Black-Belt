package task_22_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Objects;

public class lesson_01 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        // Access Order - "сортировка" согласно использованию элементов;
        Student st1 = new Student("Artem", "Surname1", 3);
        Student st2 = new Student("Tom", "Surname2", 2);
        Student st3 = new Student("Anna", "Surname3", 4);
        Student st4 = new Student("Zack", "Surname4", 1);
        linkedHashMap.put(9.1, st1);
        linkedHashMap.put(7.6, st2);
        linkedHashMap.put(8.7, st3);
        linkedHashMap.put(7.0, st4);
        System.out.println(linkedHashMap);
    }
}

final class Student implements Comparable<Student> {
    private final String name;
    private final String surname;
    private final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
