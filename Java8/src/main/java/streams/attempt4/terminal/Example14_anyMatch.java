package streams.attempt4.terminal;

import java.util.stream.Stream;

public class Example14_anyMatch {
    public static void main(String[] args) {
        boolean result = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(x -> x ==3);

        System.out.println(result);
    }
}
