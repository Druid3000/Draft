package streams.attempt2.intermediate;

import java.util.stream.IntStream;

public class Example6_sorted {
    public static void main(String[] args) {
        IntStream.range(0, 100)
                .sorted()
                .limit(50)
                .forEach(System.out::println);
    }
}
