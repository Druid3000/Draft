package lambda.types.typeInference;

import lambda.types.Summator;

public class Example {

    private static Integer sum(Integer left, Integer right) {
        return left + right;
    }

    private static <T extends Number> void process(Summator<T> summator){

    }

    public static void main(String[] args) {
        Summator<Integer> summator = Example::sum;

        process(summator);

        // TODO: Как сделать это с помощью лямбда-выражения?
//        process((left, right) -> Example.sum(left, right));// ошибка
        /*
            Когда мы вызываем метод process, у него в текущем объявлении указано,
            что он должен быть T extends Number, но он не знает, какой именно.
            По идее мы можем сузить параметр, где отмечен курсор до какого-то типа:
         */

        //можно сделать так:
        process((Integer left, Integer right) -> Example.sum(left, right));
        //или так
        process((left, right) -> Example.sum((Integer)left, (Integer)right));


    }
}
