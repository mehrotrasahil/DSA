package Streams.Sorted;

import java.util.stream.Stream;

public class NaturalOrdering {
    public static void main(String[] args) {
       Stream.of("Banana","Cherry","Orange","Apple","Lemon")
        .sorted()    // Natural lexicographical order
        .forEach(System.out::println);
    }
    
}
