package streams.attempt4.terminal;

import java.util.stream.IntStream;

public class Example3_count {
    public static void main(String[] args) {
        long count = IntStream.range(0, 10)
                .flatMap(x -> IntStream.range(0, x))
                .count();
        System.out.println(count);
    }
}
