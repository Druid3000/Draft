package streams.attempt1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list = Arrays.stream(args).filter(s-> s.length()<=2).collect(Collectors.toList());
    }
}
