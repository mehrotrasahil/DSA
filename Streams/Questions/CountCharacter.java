package Streams.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharacter {

    public static void main(String[] args) {
        String str = "Hello World";

        Map<Character, Long> countChar = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .map(Character::toUpperCase)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()));

        System.out.println(countChar);

    }
}
