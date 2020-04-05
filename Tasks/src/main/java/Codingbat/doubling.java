package Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class doubling {

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                        .map(x -> x*2)
                        .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        System.out.println(doubling(Arrays.asList(1,2, 3)));
    }
}
