package streams.attempt4.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class Example11_findAny {
    public static void main(String[] args) {
        Optional<Integer> any = Stream.of(12,13,14,6,12,45)
                .parallel()
                .findAny();

        if(any.isPresent()) {
            System.out.println(any.get());
        }
    }
}
