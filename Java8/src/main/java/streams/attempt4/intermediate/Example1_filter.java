package streams.attempt4.intermediate;

import java.util.stream.Stream;

public class Example1_filter {
    public static void main(String[] args) {
        Stream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x > 100)
                .forEach(System.out::println);
    }
}
