package Map;

public class Employee {
     private String name;
     private String department;
     private long salary;



     public Employee(String name, String department, long salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
     }


     public Employee(){}

     public void setSalary(long salary){
      this.salary = salary;
     }

     public void setName(String name){
      this.name = name;
     }

     public void setDepartment(String department){
      this.department = department;
     }
     public long getSalary(){
      return salary;
     }

     public String getName(){
      return name;
     }

     public String department(){
      return department;
     }



}
