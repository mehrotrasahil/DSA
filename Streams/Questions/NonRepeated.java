package Streams.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class NonRepeated {
    public static void main(String[] args) {
        String str = "swiss";


        Character chr = str.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet().stream()
        .filter(e -> e.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null);


        System.out.println(chr);
    }
    
}
