package streams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2_pathToStringMap {

    //Даны пути к файлам, нужно сделать лист путей в виде string. Сделать мапу string к long,
    // где стринг тот же путь, а long длина файла.

    public static void main(String[] args) {

        Path path = Paths.get("c:\\data\\myfile.txt");

        List<Path> pathList = new ArrayList<>();

        pathList.add(Paths.get("c:\\data\\myfile.txt"));
        pathList.add(Paths.get("d:\\folder\\filename.txt"));

        Map<String, Long> map = pathList.stream()
            .map(p -> p.getParent().toString() + "\\" + p.getFileName().toString())
            .collect(Collectors.toMap(
                    s -> s,
                    s -> new Long(s.length())
            ));

        System.out.println(map);

    }
}
