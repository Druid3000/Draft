package Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class noNeg {
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(x -> x >= 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(noNeg(Arrays.asList(1, -2)));
    }
}
