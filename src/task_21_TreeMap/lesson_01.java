package task_21_TreeMap;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class lesson_01 {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        TreeMap<Student, Double> treeMap1 = new TreeMap<>(); // class Student implements Comparable
        Student st1 = new Student("Artem", "Surname1", 3);
        Student st2 = new Student("Tom", "Surname2", 2);
        Student st3 = new Student("Anna", "Surname3", 4);
        Student st4 = new Student("Zack", "Surname4", 1);
        Student st5 = new Student("Ben", "Surname5", 2);
        Student st6 = new Student("Elena", "Surname6", 3);
        Student st7 = new Student("Igor", "Surname7", 4);
        treeMap.put(9.1, st1);
        treeMap.put(7.6, st7);
        treeMap.put(8.7, st2);
        treeMap.put(7.1, st4);
        treeMap.put(7.9, st3);
        treeMap.put(9.0, st6);
        treeMap.put(8.1, st5);
        System.out.println("treeMap = " + treeMap);

        treeMap1.put(st1, 9.1);
        treeMap1.put(st7, 7.6);
        treeMap1.put(st2, 8.7);
        treeMap1.put(st4, 7.0);
        treeMap1.put(st3, 7.9);
        treeMap1.put(st6, 9.0);
        treeMap1.put(st5, 8.0);
        System.out.println("treeMap1 = " + treeMap1);

       // get - взять/вывести на экран элемент (по ключу);
        System.out.println(treeMap.get(9.1));

        // remove - удаление (по ключу);
        treeMap.remove(7.6);
        System.out.println(treeMap);

        // descendingMap - разворачивание treeMap в обратном порядке (ключ по убыванию);
        // tailMap - найти/вывести на экран все ключи выше (например) 7.1 (включительно);
        // headMap - найти/вывести на экран все ключи ниже (например) 9.8;
        // lastEntry - находит/выводит на экран элемент с самым большим значением ключа;
        // firstEntry - находит/выводит на экран элемент с самым маленьким значением ключа;
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(7.1));
        System.out.println(treeMap.headMap(9.8));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
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
