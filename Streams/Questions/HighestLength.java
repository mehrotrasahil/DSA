package Streams.Questions;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLength {
    public static void main(String[] args) {
        String str = "I am Learning Stream API In Java";

        String ans = Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length)).get();

        System.out.println("Longest String is: " + ans);
    }
}
