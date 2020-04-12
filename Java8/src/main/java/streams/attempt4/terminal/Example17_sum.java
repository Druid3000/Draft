package streams.attempt4.terminal;

import java.util.stream.LongStream;

public class Example17_sum {
    public static void main(String[] args) {
        long result = LongStream.range(2, 16)
                .sum();

        System.out.println(result);
    }
}
