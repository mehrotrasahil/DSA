package Streams.Map;

public class Employee{
    private int empId;
    private String empName;

    public Employee(){}

    public Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [empId=" + empId + ", empName=" + empName + "]";
    }
}