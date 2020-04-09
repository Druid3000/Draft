package streams.attempt4.terminal;

import java.util.stream.Stream;

public class Example9_min {
    public static void main(String[] args) {
        int min = Stream.of(20, 11, 15, 75, 13)
                .min(Integer::compare).get();
        System.out.println(min);
    }
}
