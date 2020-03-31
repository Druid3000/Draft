package streams.attempt2.intermediate;

import java.util.stream.Stream;

public class Example1_map {
    public static void main(String[] args) {
        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x+10)
                .forEach(System.out::println);
    }
}
