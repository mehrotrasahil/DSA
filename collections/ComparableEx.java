import java.util.*;


public class ComparableEx {
    static class Employee implements Comparable<Employee>{
        int salary;
        String name;
        
        public Employee(int salary, String name){
            this.salary = salary;
            this.name = name;
        }
        
        @Override
        public int compareTo(Employee other){
            return this.salary - other.salary;
        }
        
        @Override
        public String toString(){
            return salary + "-" + name + ".";
        }
    }
    public static void main(String[] args) {
        
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1000, "sahil"));
        emps.add(new Employee(1231, "Rahul"));
        emps.add(new Employee(123, "Kiran"));
        
        Collections.sort(emps);
        
        System.out.println(emps);
        
        
    }
}
