package lambda.types.methodReference.typeMethodReference;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {

        String str = "hello";

        Supplier<Integer> getStrLength = str::length;
        Integer resultSupplier = getStrLength.get();

        /*
            Внутри класса String есть не статический класс length.
            В первом случае мы сослались на конкретный экземпляр - str,
            то есть у нас есть конкретная строка, когда ты вызовешь метод get(),
            то ты получишь значение строки “hello”
         */
        Function<String, Integer> getLength = String::length;
        Integer resultFunction = getLength.apply("123");

        System.out.println(resultSupplier);
        System.out.println(resultFunction);

        /*
            И то, и другое - это ссылка на нестатический метод.
            В первом случае это ссылка на нестатический метод объекта,
            а во втором случае, это ссылка на нестатический метод типа.
            В первом случае мы говорим на тебе объект и дергай из него методы,
            а во втором случае “Я сошлюсь на какой-то метод, потом я тебе подложу объект
            и ты у него будет дергать этот не статический метод.
         */
    }
}
