public class Palindrom {
    public static void main(String[] args) {
        String string1 = "abccba";
        String string2 = "abcdef";

        char[] c = string2.toCharArray();
        for(int i = 0; i < c.length/2; i++){
            if(c[i] != c[c.length-1-i]) {
                System.out.println("It's not a palindrom");
                break;
            }
        }

        StringBuffer string4 = new StringBuffer("abccba");
        StringBuffer string5 = string4.reverse();
        if(string4.equals(string5)) System.out.println("It's a palindrom");
    }
}

