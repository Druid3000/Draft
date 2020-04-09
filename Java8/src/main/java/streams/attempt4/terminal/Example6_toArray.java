package streams.attempt4.terminal;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example6_toArray {
    public static void main(String[] args) {
            String[] strings = Stream.of("a", "b", "c", "d")
                    .toArray(String[]::new);

        for (String str : strings) {
            System.out.println(str);
        }

        Arrays.stream(strings).forEach(System.out::println);
    }
}
