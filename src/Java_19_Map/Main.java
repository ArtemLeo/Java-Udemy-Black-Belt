package Java_19_Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        // put - добавление элементов в Map;
        map1.put(22455, "Tom");
        map1.put(98374564, "Anna");
        map1.put(5395, "Den");
        map1.put(948556, "Den");
        map1.put(null, "Zack");
        map1.put(9483722, null);
        System.out.println(map1);

        // putIfAbsent - добавить элемент, если такой отсутствует (с такими параметрами);
        map1.putIfAbsent(5395, "Artem");
        System.out.println(map1);

        // get - находит/выводит на экран элемент по ключу;
        System.out.println(map1.get(5395));

        // remove - удаление элемента по ключу;
        map1.remove(948556);
        System.out.println(map1);

        // containsValue - проверка на наличие элемента по значению;
        System.out.println(map1.containsValue("Den"));

        // containsKey - проверка на наличие элемента по ключу;
        System.out.println(map1.containsKey(837463));

        // keySet - находит/выводит на экран все ключи;
        System.out.println(map1.keySet());

        // values - находит/выводит на экран все значения;
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Tom", "Funny");
        map2.put("Anna", "Strong");
        System.out.println(map2);
    }
}
