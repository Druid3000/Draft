package streams.attempt4.terminal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4_collect {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1, 2, 3)
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        String s = Stream.of(1, 2, 3)
                .map(String::valueOf)
                .collect(Collectors.joining("-", "<", ">"));

        System.out.println(s);
    }
}
