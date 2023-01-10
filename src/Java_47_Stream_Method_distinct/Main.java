package Java_47_Stream_Method_distinct;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // distinct - output UNIQUE elements;
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream.distinct().forEach(System.out::println);
    }
}
