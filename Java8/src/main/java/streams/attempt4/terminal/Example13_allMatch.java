package streams.attempt4.terminal;

import java.util.stream.Stream;

public class Example13_allMatch {
    public static void main(String[] args) {
        boolean result = Stream.of(1, 2, 3, 4, 5)
                .allMatch(x -> x <= 7);

        System.out.println(result);
    }
}
