package streams.attempt1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream2 {
    public static void main(String[] args) {
        IntStream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x<300)
                .map(x -> x+11)
                .limit(3)
                .forEach(System.out::print);

        int[] i = {0,1,22};
        Arrays.stream(i).filter(x -> x <22 ).forEach(System.out::println);
    }
}
