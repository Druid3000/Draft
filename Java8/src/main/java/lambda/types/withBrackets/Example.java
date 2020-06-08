package lambda.types.withBrackets;

import lambda.types.Summator;

public class Example {

    private static void doSum(Summator<Integer> summator){
        Integer result = summator.sum(1, 2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Summator<Integer> summator = (left, right) -> {
            System.out.print("Sum = ");
            return left+right;
        };

        doSum(summator);
    }
}
