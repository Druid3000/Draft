package lambda.types;

@FunctionalInterface
public interface Summator<T> {
    T sum (T left, T right);

    static void add(){

    }

    default T twice(T value){
        return sum(value, value);
    }
}
