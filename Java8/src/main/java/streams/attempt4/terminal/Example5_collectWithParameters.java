package streams.attempt4.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example5_collectWithParameters {
    public static void main(String[] args) {
        List<String> list = Stream.of("a", "b", "c", "d")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        list.forEach(System.out::println);
    }
}
