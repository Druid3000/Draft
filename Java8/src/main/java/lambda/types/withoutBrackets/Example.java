package lambda.types.withoutBrackets;

import lambda.types.Summator;

public class Example {

    private static void doSum(Summator<Integer> summator) {
        Integer result = summator.sum(1, 2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Summator<Integer> summator = (left, right) -> left + right;
        doSum(summator);
        System.out.println(summator.sum(1, 2));
    }
}
