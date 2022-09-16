package task_25_TreeSet;

import java.util.Objects;
import java.util.TreeSet;

public class lesson_02 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Tom", 1);
        Student st2 = new Student("Anna", 2);
        Student st3 = new Student("Artem", 3);
        Student st4 = new Student("Zoe", 4);
        Student st5 = new Student("Den", 5);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);

        Student st6 = new Student("Max", 5);

        // first - находит/выводит на экран первый элемент в treeSet;
        System.out.println(treeSet.first());

        // last - находит/выводит на экран последний элемент в treeSet;
        System.out.println(treeSet.last());

        // tailSet - найти/вывести на экран всех студентов выше (например) 1-го курса (включительно);
        System.out.println(treeSet.tailSet(st1));

        // headSet - найти/вывести на экран всех студентов ниже (например) 5-го курса;
        System.out.println(treeSet.headSet(st5));

        // subSet - найти/вывести на экран значения элементов, которые находятся между двух показателей (которые укажем);
        System.out.println(treeSet.subSet(st1, st5));

        // Правило сравнения элементов;
        // a.equals(b) -> true;
        // a.compareTo(b) -> 0;
        // Количество элементов сравнения должно совпадать в (equals-hashCode-compareTo)
        // Например: сравнение только по курсу/имени и по нескольким элементам;
        System.out.println(st5.equals(st6)); // true
        System.out.println(st5.hashCode() == st6.hashCode()); // true
        System.out.println(st5.compareTo(st6)); // 0
    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course; //&& Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}