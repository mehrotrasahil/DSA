package Streams.Questions;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Map;

public class FindFirstNonRepeating {
    public static void main(String[] args) {
        String str = "eeyyhthddyejjqq";

        Optional<Character> ch = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(ch.orElse(null));

    }

}
