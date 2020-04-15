package streams.attempt4.collectors;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4_toMap_Suppllier {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toMap(Function.identity(), Function.identity()));
        System.out.println(map1);

        Map<Integer, String> map2 = Stream.of(1, 2, 3)
                .collect(Collectors.toMap(
                        Function.identity(),
                        i -> String.format("%d * 2 = %d", i, i * 2)
                ));
        System.out.println(map2);

        Map<Character, String> map3 = Stream.of(50, 54, 55)
                .collect(Collectors.toMap(
                        i -> (char) i.intValue(),
                        i -> String.format("<%d", i)
                ));
        System.out.println(map3);
    }
}
