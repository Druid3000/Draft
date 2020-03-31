package streams.attempt3.intermediate;

import java.util.stream.Stream;

public class Example9_takeWhile {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 2, 5)
//                .takeWhile(x -> x < 3)
                .forEach(System.out::println);
    }
}
