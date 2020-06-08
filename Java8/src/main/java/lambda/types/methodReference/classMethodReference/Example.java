package lambda.types.methodReference.classMethodReference;

import lambda.types.Summator;

public class Example {

    private static String stringSum(String left, String right) {
        return left + right;
    }

    public static void main(String[] args) {
        //Summator<String> summator = (left, right) -> stringSum(left, right);
        Summator<String> summator = Example::stringSum;
        System.out.println(summator.sum("1", "2"));
    }
}
