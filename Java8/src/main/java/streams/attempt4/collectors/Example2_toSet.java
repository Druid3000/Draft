package streams.attempt4.collectors;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2_toSet {
    public static void main(String[] args) {
        Set<String> strings = Stream.of("a", "b", "c")
                .collect(Collectors.toSet());

        strings.forEach(System.out::println);
    }
}
