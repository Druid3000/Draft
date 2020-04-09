package streams.attempt4.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class Example8_reduceOptional {
    public static void main(String[] args) {
        Optional<Integer> result = Stream.of(1, 2, 3, 4, 5)
                .reduce((acc, x) -> acc + x);

        System.out.println(result.isPresent());

        Optional<Integer> sum = Stream.<Integer>empty()
                .reduce((acc, x) -> acc + x);

        System.out.println(sum.orElse(10));
    }
}
