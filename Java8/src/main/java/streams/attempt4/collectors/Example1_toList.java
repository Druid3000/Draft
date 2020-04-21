package streams.attempt4.collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1_toList {
    public static void main(String[] args) {
        List<String> strings = Stream.of("a", "b", "c ")
                .collect(Collectors.toList());

        strings.forEach(System.out::println);
    }



}
