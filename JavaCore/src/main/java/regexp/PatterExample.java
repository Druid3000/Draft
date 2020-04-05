package regexp;

import java.util.regex.Pattern;

public class PatterExample {
    public static void main(String[] args) {
        String pattern01 = "<+";
        String pattern02 = "<?";
        String pattern03 = "<*";

        String str = "<body><h1> a<<<b </h1></body>";
        String[] result;

        Pattern p = Pattern.compile(pattern01);
        result = p.split(str);
        printTokens(result);

//        p = Pattern.compile(pattern02);
//        result = p.split(str);
//        printTokens(result);
//
//        p = Pattern.compile(pattern03);
//        result = p.split(str);
//        printTokens(result);
    }

    private static void printTokens(String[] tokens){
        for (String str: tokens){
            if("".equals(str)){
                System.out.println("\"\"" + "|");
            } else {
                System.out.println(str + "|");
            }
        }
    }
}
