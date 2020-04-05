package Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class noTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(x -> x < 13 || x > 19)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(noTeen(Arrays.asList(12, 13, 19, 20)));
    }

}
