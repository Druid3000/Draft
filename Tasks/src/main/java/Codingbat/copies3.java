package Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class copies3 {
    public static List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s+s+s)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(copies3(Arrays.asList("a", "bb", "ccc")));
    }
}
