package Java_46_Stream_Method_concat;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> streamConcat = Stream.concat(stream1, stream2);
        streamConcat.forEach(System.out::println);
    }
}
