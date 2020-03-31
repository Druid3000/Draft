package streams.attempt1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream8_terminal {
    public static void main(String[] args) {

        Stream.of(120, 410, 85, 32, 314, 12)
                .forEach(x -> System.out.println(x));


        System.out.println();
        IntStream.range(0, 100000)
                .parallel()
                .filter(x -> x % 10000 == 0)
                .map(x -> x / 10000)
                .forEachOrdered(System.out::println);

        System.out.println();
        IntStream.range(0, 10)
                .parallel()
                //.forEach(System.out::println);
                .forEachOrdered(System.out::println);


        System.out.println();
        long count = IntStream.range(0, 10)
                .flatMap(x -> IntStream.range(0, x))
                .count();
        System.out.println(count);

        System.out.println();
        List<String> list = Stream.of("1", "2", "3")
            .collect(Collectors.toList());
        System.out.println(list);

        System.out.println();
        String s = Stream.of(1, 2, 3)
                .map(String::valueOf)
                .collect(Collectors.joining("-", "<", ">"));
        System.out.println(s);

        System.out.println();
        List<String> list1 = Stream.of("a", "b", "c", "d")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(list1);

        System.out.println();
        String[] elements = Stream.of("a", "b", "c", "d")
                .toArray(String[]::new);
        for (String string : elements) {
            System.out.print(string + " ");
        }

        System.out.println();
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(10, (acc, x) -> acc + x);
        System.out.println(sum);

        System.out.println();
        int min = Stream.of(20, 11, 45, 78, 13)
                .min(Integer::compare).get();
        System.out.println(min);


        System.out.println();
        boolean result = Stream.of(1, 2, 3, 4, 5, 10)
                .allMatch(x -> x <= 7);
        System.out.println(result);

        System.out.println();
        boolean result2 = Stream.of(120, 410, 58, 32, 314, 12)
                .noneMatch(x-> x%2 ==1);
        System.out.println(result2);
    }
}

