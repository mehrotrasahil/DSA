import java.util.*;

public class ComparatorEx {
    
    static class Employee{
        String name;
        int salary;
        
        public Employee(int salary, String name){
            this.salary = salary;
            this.name = name;
        }
        
        @Override
        public String toString(){
            return salary + "-" + name + ".";
        }
    }
    
    static class NameComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee ob1, Employee ob2){
            return ob1.name.compareTo(ob2.name);
        }
    }
    
    static class SalaryComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee ob1, Employee ob2){
            return ob2.salary - ob1.salary;
        }   
    }    
   
    public static void main(String[] args) {
        
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1000, "Arman"));
        emps.add(new Employee(476238, "Kiran"));
        emps.add(new Employee(12312, "Zelensky"));
        
        Collections.sort(emps, new NameComparator());
        
        System.out.println(emps);

        
        Collections.sort(emps, new SalaryComparator());
        
        
        System.out.println(emps);
        
        
    }
}
