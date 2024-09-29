package Streams.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        String str = "Hello World";

        List<Integer> list= Arrays.asList(1,1,1,1,1,3,4,5,2,6,4,8,5,3,7,3);

        Map<Integer, Long> frequency = list.stream()
        .collect(Collectors.groupingBy(n -> n, Collectors.counting()));




        Map<Character, Long> frequencyChar = str
                                            .chars()
                                            .mapToObj(c -> (char) c)
                                            .filter(c -> c != ' ')
                                            .map(Character::toUpperCase)
                                            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        frequency.forEach((ch,fr) -> System.out.println(ch + ": " + fr));
        frequencyChar.forEach((ch,fr) -> System.out.println(ch + ": " + fr));

    }
}
