package streams.attempt4.intermediate;

import java.util.stream.Stream;

public class Example2_map {
    public static void main(String[] args) {
        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x + 1)
                .forEach(System.out::println);
    }
}
