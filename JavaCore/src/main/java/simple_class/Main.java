package simple_class;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        test.setA(1);
        test.setB(2);

        System.out.println(test.sum());
    }

}
