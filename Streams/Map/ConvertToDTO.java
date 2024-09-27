package Streams.Map;

import java.util.*;

public class ConvertToDTO {
    public static void main(String[] args) {
       List<Employee> list = Arrays.asList(
        new Employee(11,"Sahil"),
        new Employee(12,"Deva"),
        new Employee(13,"Prabhat")
       );
        
       list.stream()
       .map(emp -> new Employee(emp.getEmpId(), emp.getEmpName()))
       .forEach(System.out::println);
    }
    
}
