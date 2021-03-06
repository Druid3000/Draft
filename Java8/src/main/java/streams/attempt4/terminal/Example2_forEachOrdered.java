package streams.attempt4.terminal;

import java.util.stream.IntStream;

public class Example2_forEachOrdered {
    public static void main(String[] args) {
        IntStream.range(0, 100000)
                .parallel()
                .filter(x -> x % 10000 == 0)
                .map(x -> x /10000)
                .forEach(System.out::println);

        System.out.println("\n");

        IntStream.range(0, 100000)
                .parallel()
                .filter(x -> x % 10000 == 0)
                .map(x -> x /10000)
                .forEachOrdered(System.out::println);
    }
}
