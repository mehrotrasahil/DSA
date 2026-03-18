package Streams.Questions;

import java.util.Arrays;
import java.util.List;

public class FilterNumber {
    public static void main(String[] args) {
        List<Integer> numIntegers = Arrays.asList(10, 100, 20, 45, 9999, 384, 98);

        // Filter number with two digits
        List<Integer> filter = numIntegers.stream().filter(n -> n > 10 && n < 100).toList();
        System.out.println(filter);

        // Filter numbers starting with 1
        List<Integer> filter2 = numIntegers.stream().filter(n -> String.valueOf(n).startsWith("1")).toList();
        filter2.forEach(System.out::println);
    }

}
