public class Fibonacci {

    public static int recursive(int x){
        if(x == 0) {
            return 1;
        }
        else{
            return x + recursive(x-1);
        }
    }

    public static int iterative(int x){

       if(x == 0) return 1;
       if(x == 1) return 1;

        int f = 0;
        for (int i = 2; i < x; i++) {
            f = i + i-1;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(recursive(5));
        System.out.println();
        System.out.println(iterative(7));
    }
}
