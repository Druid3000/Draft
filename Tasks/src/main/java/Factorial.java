public class Factorial {

    public static int recursive(int x){
        if(x < 2) {
            return x;
        }
        else{
            return recursive(x - 1) + recursive (x-2);
        }
    }


    public static void main(String[] args) {
        System.out.println(recursive(9));
    }
}
