package Streams.Questions;

import java.util.HashMap;
import java.util.Map;

public class OddChar {
    public static void main(String[] args) {
        String str1 = "aabcde";
        String str2 = "abcdef";

        Map<Character, Long> frequency = new HashMap<>();

        // Count occurrences in str1
        str1.chars()
            .mapToObj(c -> (char) c)
            .forEach(c -> frequency.put(c, frequency.getOrDefault(c, 0L) + 1));

        // Count occurrences in str2
        str2.chars()
            .mapToObj(c -> (char) c)
            .forEach(c -> frequency.put(c, frequency.getOrDefault(c, 0L) - 1)); // Use -1 to find odd

        // Find the character with a non-zero count
        Character ch = frequency.entrySet().stream()
            .filter(e -> e.getValue() != 0) // Look for non-zero counts
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);

        System.out.println(ch); // Output the odd character
    }
}
