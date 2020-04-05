package Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class addStar {
    public static List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s + "*")
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(addStar(Arrays.asList("a", "b", "c")));
    }
}

