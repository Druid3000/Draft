package Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class square {

    public static List<Integer> square(List<Integer> nums){
        return nums.stream()
                        .map(x -> x*x)
                        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(square(Arrays.asList(1, 2, 3)));
    }
}
