package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterSplitExample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("J\\w*");
        String text = "Java is fun; javaStript is funny.; JFunny ; just";
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println("Found '" + m.group(0) + "' at position " + m.start(0) + " - " + m.end(0));
        }
//
//        if(m.start(0) < m.end(0))
//            System.out.println("Suffix is " + m.group(1));

    }
}
