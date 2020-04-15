package streams.attempt4.collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example5_toMap_Function {
    public static void main(String[] args) {
        Map<Integer, String> map4 = Stream.of(50, 55, 69, 20, 19, 52)
                .collect(Collectors.toMap(
                        i -> i % 5,
                        i -> String.format("<%d>", i),
                        (a, b) -> String.join(", ", a, b)
                ));

        System.out.println(map4);
    }
}
