package streams.attempt4.collectors;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example7_collectingAndThen {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1,2,3,4,5)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList
                ));

        list.forEach(System.out::println);
        System.out.println(list.getClass());
    }
}
