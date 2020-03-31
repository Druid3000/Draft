package streams.attempt2.intermediate;

import java.util.stream.Stream;

public class Example5_skip {
    public static void main(String[] args) {
        Stream.of(120, 41, 85, 32, 314, 32)
                .skip(2)
                .forEach(System.out::println);
    }
}
