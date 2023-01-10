package Java_45_Streams_Method_chaining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        // Without "Terminal" method, the "Intermediate" method will NOT work;
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.filter(el -> {
            System.out.println("!!!!");
            return el % 2 == 0;
        }).collect(Collectors.toList());
    }
}
