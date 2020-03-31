package streams.attempt2.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class Example5_reduce {
    public static void main(String[] args) {
        Optional<Integer> sum = Stream.of(1, 2, 3)
                .reduce((acc, x) -> acc + x);

        System.out.println(sum.get());
    }
}
