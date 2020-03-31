package streams.attempt2.intermediate;

import java.util.stream.Stream;

public class Example2_filter {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 10, 11)
                .filter(x -> x==10)
                .forEach(System.out::println);
    }
}
