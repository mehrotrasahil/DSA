package Streams.Filter;

import java.util.Arrays;
import java.util.List;

import Streams.Structure.Person;

public class ClassFilter {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
            new Person("Rohan", 32),
            new Person("Rahul", 27),
            new Person("Ganesh", 30)
        );
    
        
        list.stream()
        .filter(p -> p.getAge() >= 30)  
        .forEach(System.out::println);   
    }

}
