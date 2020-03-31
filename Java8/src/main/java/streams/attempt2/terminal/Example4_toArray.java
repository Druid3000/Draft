package streams.attempt2.terminal;

import java.util.stream.Stream;

public class Example4_toArray {
    public static void main(String[] args) {
        String[] elements = Stream.of("a", "b", "c", "d")
                .toArray(String[]::new);

        for (String s : elements) {
            System.out.println(s);
        }
    }
}
