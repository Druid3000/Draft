package streams.attempt1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.parallelStream()
                .filter(x -> x < 3)
                .map(x -> x*2)
//                .collect(Collectors.toList());
                .forEach(System.out::println);


//        for(Integer item: list){
//            System.out.println(item);
//        }


        IntStream.range(0, 10)
                .parallel()
                .map(x -> x * 10)
                .sum();

    }
}
