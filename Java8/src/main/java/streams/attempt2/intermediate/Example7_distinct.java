package streams.attempt2.intermediate;

import java.util.stream.Stream;

public class Example7_distinct {
    public static void main(String[] args) {
        Stream.of(2, 1, 8, 1, 3, 2)
                .distinct()
                .forEach(System.out::println);
    }
}
