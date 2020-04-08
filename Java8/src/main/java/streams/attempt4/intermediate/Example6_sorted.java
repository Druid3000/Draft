package streams.attempt4.intermediate;

import java.util.stream.Stream;

public class Example6_sorted {
    public static void main(String[] args) {
        Stream.of(5, 6, 8, 9, 1)
                .sorted()
                .forEach(System.out::println);
    }
}
