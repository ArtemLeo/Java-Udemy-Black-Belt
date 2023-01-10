package Java_48_Stream_Method_count;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Count method - calculates the number of elements in the stream;
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream.count());
        System.out.println("--------------");

        // Calculates the number of UNIQUE elements in the stream;
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream1.distinct().count());
    }
}
