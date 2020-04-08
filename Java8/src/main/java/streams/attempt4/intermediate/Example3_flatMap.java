package streams.attempt4.intermediate;

import java.util.stream.Stream;

public class Example3_flatMap {
    public static void main(String[] args) {
        Stream.of(2, 3, 0, 1, 3)
                .flatMap(x -> Stream.of(x, x))
                .forEach(System.out::println);
    }
}
