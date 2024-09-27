package Streams.Filter;

import java.util.stream.Stream;

public class FilterBasedOnLength {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Kia","Tata","Honda","Audi","Maruti");

        stream.filter(s -> s.length() > 3)
        .forEach(System.out::println);
    }
    
}
