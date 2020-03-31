package streams.attempt1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream9_CollectorsMethods {
    public static void main(String[] args) {
        Deque<Integer> deque = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println(deque);


        System.out.println();
        Map<Integer, Integer> map1 = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toMap(
                        Function.identity(),
                        Function.identity()
                ));
        System.out.println(map1);

        System.out.println();
        Map<Integer, String> map2 = Stream.of(1, 2, 3)
                .collect(Collectors.toMap(
                        Function.identity(),
                        i -> String.format("12")
                ));
        System.out.println(map2);

    }
}
