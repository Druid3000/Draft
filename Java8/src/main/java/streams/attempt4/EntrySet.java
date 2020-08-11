package streams.attempt4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EntrySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");

//        map.entrySet().stream().forEach(System.out::println);
        map.entrySet().stream()
            .map(e -> e.getValue().concat(e.getKey().toString()))
            .forEach(System.out::println);
    }
}
