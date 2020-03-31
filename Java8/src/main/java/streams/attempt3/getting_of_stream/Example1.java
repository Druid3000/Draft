package streams.attempt3.getting_of_stream;

import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
        IntStream.of(120,410,85,32,314,12)
                .filter(x -> x<300)
                .map(x -> x +11)
                .limit(3)
                .forEach(System.out::print);
    }
}
