package streams.attempt1;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        System.out.println();
        Stream.of(120, 410, 85, 32, 314, 12)
                .skip(2)
                .forEach(System.out::println);
    }
}
