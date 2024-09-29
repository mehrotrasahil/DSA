package Streams.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,2,1,5,6,7,2,5);

        List<Integer> duplicate = 
        list.stream()
        .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e -> e.getValue() > 1)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());

        System.out.println(duplicate);
    }
    
}
