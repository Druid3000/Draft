package streams.attempt4.terminal;

import java.util.stream.Stream;

public class Example7_reduce {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(10, (acc, x) -> acc + x);
        System.out.println(sum);
    }
}
