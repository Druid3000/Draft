package streams.attempt2.terminal;

import java.util.stream.Stream;

public class Example1_foreach {
    public static void main(String[] args) {
        Stream.of(120, 410, 85, 32, 314, 12)
                .forEach(x -> System.out.format("%s, ", x));
    }
}
