package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1_pathToStringMapBad {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("D:\\folder1", "D:\\folder2");
        strings.stream()
                .collect(Collectors.toMap(
                        o -> o,
                        o -> {
                            try{
                                return Files.lines(Paths.get(o)).count();
                            }catch(IOException e){
                                e.printStackTrace();
                            }
                         return o;
                        }));
    }
}
