package streams.attempt2.intermediate;

import java.util.stream.Stream;

public class Example3_flatMap {
    public static void main(String[] args) {
        Stream.of(2, 3, 0, 1, 3)
//                .flatMap(x -> IntStream.range(0, x))
                .forEach(System.out::println);
    }
}
