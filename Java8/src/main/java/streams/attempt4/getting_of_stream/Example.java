package streams.attempt4.getting_of_stream;

import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        IntStream.of(120,410,32,314,12)
                .filter(x -> x <300)
                .limit(3)
                .forEach(System.out::println);

    }
}
