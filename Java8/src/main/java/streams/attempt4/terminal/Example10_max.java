package streams.attempt4.terminal;

import java.util.stream.Stream;

public class Example10_max {
    public static void main(String[] args) {
        int max = Stream.of(20, 11, 15, 75, 13)
                .max(Integer::compare).get();
        System.out.println(max);
    }
}
