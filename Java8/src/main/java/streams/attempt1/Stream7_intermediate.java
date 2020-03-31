package streams.attempt1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream7_intermediate {
    public static void main(String[] args) {

        System.out.println();
        IntStream.range(2, 9)
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);

        System.out.println();
        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .forEach(System.out::println);

        System.out.println();
        Stream.of(120, 410, 85, 32, 314, 12)
                .map(x -> x+11)
                .forEach(System.out::println);

//        System.out.println();
//        Stream.of(2, 3, 0, 1, 3)
//                .flatMap(x -> IntStream.range(0, x))
//                .forEach(System.out::println);

        System.out.println();
        Stream.of(5, 10)
                .skip(40)
                .forEach(System.out::println);

        System.out.println();
        Stream.of(120, 410, 85, 32, 314, 12)
                .skip(2)
                .forEach(System.out::println);

        System.out.println();
        IntStream.range(0, 10)
                .limit(5)
                .skip(3)
                .forEach(System.out::println);

        System.out.println();
        Stream.of(120, 410, 58, 314, 12)
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        Stream.of(1, 2, 4, 5, 6, 2, 1)
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        Stream.of(0, 3, 0, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct: %d%n", x))
                .map(x -> x*x)
                .forEach(x -> System.out.format("after map: %d%n", x));

    }
}
