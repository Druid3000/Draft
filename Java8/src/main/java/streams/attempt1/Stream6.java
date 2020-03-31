package streams.attempt1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stream6 {
    public static void main(String[] args) {

        Stream.empty()
                .forEach(System.out::println);

        System.out.println();
        Arrays.asList(1,2,3).stream()
            .forEach(System.out::println);

        System.out.println();
        Stream.of(1, 2, 3).forEach(System.out::println);

        System.out.println();
        Stream.generate(() -> "bla-bla-bla")
                .limit(6)
                .forEach(System.out::println);

        System.out.println();
        Stream.iterate(2, x-> x+6)
                .limit(6)
                .forEach(System.out::println);

        System.out.println();
        Stream.concat(
                Stream.of(1,2,3),
                Stream.of(4,5,6)
        ).forEach(System.out::println);

        System.out.println();
        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
                .add(0)
                .add(1);
        for(int i = 2; i <= 8; i += 2){
            streamBuilder.accept(i);
        }
        streamBuilder
                .add(9)
                .add(10)
                .build()
                .forEach(System.out::println);

        System.out.println();
        IntStream.range(0,10).forEach(System.out::println);

        System.out.println();
        LongStream.range(0L,10L).forEach(System.out::println);


    }
}
