package streams.attempt4.terminal;

import java.util.stream.Stream;

public class Example15_nonMatch {
    public static void main(String[] args) {
        boolean result = Stream.of(1, 2, 3, 4, 5)
                .noneMatch(x -> x==9);

        System.out.println(result);
    }
}
