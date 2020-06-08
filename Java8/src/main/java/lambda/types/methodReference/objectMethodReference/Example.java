package lambda.types.methodReference.objectMethodReference;

import lambda.types.Summator;

public class Example {

    private String stringSumWithDelimiter(String left, String right) {
        return left + "-" + right;
    }

    public static void main(String[] args) {
        Example example = new Example();
        Summator<String> summator = example::stringSumWithDelimiter;
    }
}
