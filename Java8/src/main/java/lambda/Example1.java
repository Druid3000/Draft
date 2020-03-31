package lambda;

public class Example1 {

    public static void main(String[] args) {
        Runnable privet = () -> {
            System.out.println("Privet");
        };

        privet.run();

    }
}
