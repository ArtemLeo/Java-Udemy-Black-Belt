package task_19_Map;

import java.util.HashMap;
import java.util.Map;

public class lesson_01 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        // put - ���������� ��������� � Map;
        map1.put(22455, "Tom");
        map1.put(98374564, "Anna");
        map1.put(5395, "Den");
        map1.put(948556, "Den");
        map1.put(null, "Zack");
        map1.put(9483722, null);
        System.out.println(map1);

        // putIfAbsent - �������� �������, ���� ����� ����������� (� ������ �����������)
        map1.putIfAbsent(5395, "Artem");
        System.out.println(map1);

        // get - �������/������� �� ����� ������� �� �����;
        System.out.println(map1.get(5395));

        // remove - �������� �������� �� �����;
        map1.remove(948556);
        System.out.println(map1);

        // containsValue - �������� �� ������� �������� �� ��������;
        System.out.println(map1.containsValue("Den"));

        // containsKey - �������� �� ������� �������� �� �����;
        System.out.println(map1.containsKey(837463));

        // keySet - �������/������� �� ����� ��� �����;
        System.out.println(map1.keySet());

        // values - �������/������� �� ����� ��� ��������;
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Tom", "Funny");
        map2.put("Anna", "Strong");
        System.out.println(map2);
    }
}
