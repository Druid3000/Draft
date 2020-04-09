package streams.attempt4.terminal;

import java.util.stream.IntStream;

public class Example12_findFirst {
    public static void main(String[] args) {
        int firstSeq = IntStream.range(4, 65536)
                .findFirst().getAsInt();

        System.out.println(firstSeq);
    }
}
