package lambda.types.methodReference.staticMethodReference;

import lambda.types.Summator;

import java.util.Comparator;

public class Example {

    private static String stringSum(String left, String right) {
        return left + right;
    }

    public static void main(String[] args) {
        Summator<String> summator = Example::stringSum;

//        Comparator<Integer> integerComparator = (a, b) -> Integer.compare(a, b);

        /*
            Мы можем ссылаться на свои объявленные статические методы и другого класса.
            TODO: Не понял, чем это отличается от classMethodReference...
         */
        Comparator<Integer> integerComparator = Integer::compare;
    }
}
