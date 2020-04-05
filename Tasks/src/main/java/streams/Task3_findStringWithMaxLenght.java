package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task3_findStringWithMaxLenght {

    //Вывести String с наибольшим размером

    public static void withStream(){
        System.out.println(Stream.of("abc", "bcde", "fgtry")
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length())).get());
    }

    public static void withoutStream(){
        List<String> strings = Arrays.asList("abc", "bcde", "fgtry");

        String tempString = null;
        int maxLenght = 0;

        for (String s : strings) {
            if(s.length() > maxLenght){
                maxLenght = s.length();
                tempString = s;
            }
        }

        System.out.println(tempString);
    }


    public static void main(String[] args) {
        withStream();
        System.out.println("-------");
        withoutStream();
    }
}
