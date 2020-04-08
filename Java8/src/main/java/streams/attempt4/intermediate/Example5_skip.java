package streams.attempt4.intermediate;

import java.util.stream.Stream;

public class Example5_skip {
    public static void main(String[] args) {
        Stream.of(120, 410, 85, 32, 314, 12)
                .skip(2)
                .forEach(System.out::println);
    }
}
