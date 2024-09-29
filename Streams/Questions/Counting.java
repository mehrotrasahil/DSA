package Streams.Questions;

import java.util.Map;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        String str = "Hello World";

        Map<Character, Long> frequency = str
                                            .chars()
                                            .mapToObj(c -> (char) c)
                                            .filter(c -> c != ' ')
                                            .map(Character::toUpperCase)
                                            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        frequency.forEach((ch,fr) -> System.out.println(ch + ": " + fr));
    }
}
