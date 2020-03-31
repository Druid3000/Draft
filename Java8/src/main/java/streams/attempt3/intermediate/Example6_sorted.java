package streams.attempt3.intermediate;

import java.util.stream.Stream;

public class Example6_sorted {
    public static void main(String[] args) {
        Stream.of(120, 410, 85, 32, 314, 12)
                .sorted()
                .forEach(x -> System.out.println(x + " "));
    }
}
