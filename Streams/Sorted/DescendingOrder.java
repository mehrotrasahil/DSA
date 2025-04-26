package Streams.Sorted;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
/**
 * Write a program to sort a list of integers in ascending or descending order and remove duplicates
 * input - [1,3,4,2,6,5,1,2,7,6]
 * output - [1,2,3,4,5,6,7]
 * */

public class DescendingOrder {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1,3,4,2,6,5,1,2,7,6);

        List<Integer> sortedNum = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(sortedNum);
    }

}
