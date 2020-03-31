package streams.attempt3.intermediate;

import java.util.stream.Stream;

public class Example2_map {

    public static void main(String[] args) {
        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .forEach(System.out::println);

        System.out.println("---------");

        Stream.of(120, 410, 85, 32, 314, 12)
                .map(x -> x + 11)
                .forEach(x -> System.out.print(x + " "));
    }
}
