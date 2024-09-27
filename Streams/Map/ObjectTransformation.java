package Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ObjectTransformation {
    public static void main(String[] args) {
        List<Map<String, Object>> dataList = Arrays.asList(
            Map.of("name", "John", "age", 25),
            Map.of("name", "Jane", "age", 30),
            Map.of("name", "Tom", "age", 35)
        );

        dataList.stream()
        .map(data -> data.get("name"))
        .forEach(System.out::println);
    }
    
}
