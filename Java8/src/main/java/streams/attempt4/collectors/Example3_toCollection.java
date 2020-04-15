package streams.attempt4.collectors;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3_toCollection {
    public static void main(String[] args) {
        Deque<Integer> deque = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(ArrayDeque::new));

        deque.forEach(System.out::println);

        Set<Integer> set = Stream.of(1,2, 3, 4, 5)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        set.forEach(System.out::println);
    }
}
