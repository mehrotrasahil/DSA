//Sort a list of integers based on the frequency of their appearance by using Java Streams


package Streams.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,3,4,4,5,7,2,8,8,9);

        List<Integer> result = 
        list.stream()
        .collect(Collectors.groupingBy(n -> n, Collectors.counting())) //Returns a Map where a key is the number from list and the value will be the no. of ti,es that number appeared.
        .entrySet().stream()
        .sorted((e1, e2) -> {
            int freqComparison = Long.compare(e2.getValue(), e1.getValue()); // Descending by frequency
            return freqComparison != 0 ? freqComparison : Integer.compare(e2.getKey(), e1.getKey());
        }).map(Map.Entry::getKey)
        .collect(Collectors.toList());


     // Output the sorted list
     System.out.println(result);
    }
}
