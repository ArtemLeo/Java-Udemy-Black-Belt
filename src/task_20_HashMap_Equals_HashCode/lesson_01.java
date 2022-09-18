package task_20_HashMap_Equals_HashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class lesson_01 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Tom", "SurName1", 3);
        Student st2 = new Student("Artem", "SurName2", 2);
        Student st3 = new Student("Den", "SurName3", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.4);
        map.put(st3, 7.6);
        System.out.println(map);

        Student st4 = new Student("Tom", "SurName1", 3);

        // Сравнение в map (поиск одинаковых ключей) через containsKey;
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);

        // Сравнение двух элементов через equals;
        System.out.println(st1.equals(st4));

        Student st5 = new Student("Igor", "SurName5", 3);

        // У одинаковых объектов = одинаковый hashcode;
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st5.hashCode());
        // st2.hashCode и st5.hashCode = 15; (происходит) Коллизия - объекты разные, а hashCode одинаковый;

        // entrySet - вывод ключей и значений;
        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // Начальные параметры (Initial capacity - начальный размер массива + Load factor - коэффициент заполненности массива (после размер будет увечиличен в двое);
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
    }
}

final class Student {
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

    // При помощи hashCode происходит преобразование любого объекта в int;
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
        // Условная альтернатива: return name.length() * 7 + surname.length() * 11 + course * 53;
    }
}
