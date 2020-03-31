package streams.attempt3.intermediate;

import java.util.stream.Stream;

public class Example4_limit {
    public static void main(String[] args) {
        Stream.of(120, 410, 85, 32, 314, 12)
                .limit(4)
                .forEach(x -> System.out.println(x + " "));
    }
}
