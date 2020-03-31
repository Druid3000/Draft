package streams.attempt2.intermediate;

import java.util.stream.Stream;

public class Example4_limit {
    public static void main(String[] args) {
        Stream.of(120, 410, 85, 32, 314, 12)
                .limit(4)
                .forEach(System.out::println);
    }
}
