package ArraysAsList;

import java.util.Arrays;
import java.util.List;

public class AsListExample {
    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three"};

        List<String> list = Arrays.asList(stringArray);

        System.out.println(list);

    }
}
