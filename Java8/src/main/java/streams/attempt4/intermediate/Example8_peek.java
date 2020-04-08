package streams.attempt4.intermediate;

import java.util.stream.Stream;

public class Example8_peek {
    public static void main(String[] args) {
        Stream.of(0, 3, 5, 6, 8)
                .peek(x -> System.out.print(x))
                .peek(x -> System.out.print("\n"))
                .forEach(System.out::println);
    }
}
