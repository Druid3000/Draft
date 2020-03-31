package streams.attempt1;

import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);

    }
}
