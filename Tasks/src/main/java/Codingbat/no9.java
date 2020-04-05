package Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class no9 {

    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(x -> (x+1)%10!=0)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        System.out.println(no9(Arrays.asList(1, 2, 19)));
    }
}
