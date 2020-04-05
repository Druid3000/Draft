package Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class moreY {
    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(moreY(Arrays.asList("a", "b", "c")));
    }
}
