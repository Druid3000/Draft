package streams.attempt2.parallel_stream;

import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
        IntStream.range(0, 10)
                .parallel()
                .map(x -> x*10)
                .forEach(System.out::println);
    }
}
