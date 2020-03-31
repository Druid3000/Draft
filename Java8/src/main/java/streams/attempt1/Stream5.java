package streams.attempt1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Stream5 {
    public static void main(String[] args) {

        //Вот так делать нельзя:
        final List<Integer> ints = new ArrayList<>();
        IntStream.range(0, 1000000)
                .parallel()
                .forEach(i -> ints.add(i));
        System.out.println(ints.size());
        // Это код Шрёдингера. Он может нормально выполниться и показать 1000000, может выполниться и показать 869877,
        // а может и упасть с ошибкой Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // 332 at java.util.ArrayList.add(ArrayList.java:459).

    }
}
