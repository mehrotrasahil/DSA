package Streams.Filter;

import java.util.Arrays;
import java.util.List;

import Streams.Structure.Employee;

public class ClassFilter {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("Rohan", 32),
            new Employee("Rahul", 27),
            new Employee("Ganesh", 30)
        );
    
        
        list.stream()
        .filter(person -> person.getAge() >= 30)  
        .forEach(System.out::println);   
    }

}
