package Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class two2 {
    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(x -> x* 2)
                .filter(x -> (x+8)%10 != 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(two2(Arrays.asList(1,2,3)));
    }
}
