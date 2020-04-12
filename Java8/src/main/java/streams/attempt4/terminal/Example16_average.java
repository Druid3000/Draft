package streams.attempt4.terminal;

import java.util.stream.IntStream;

public class Example16_average {
    public static void main(String[] args) {

        //It's only can be used with primitive
        double result = IntStream.of(2, 16)
                .average()
                .getAsDouble();

        System.out.println(result);
    }
}
