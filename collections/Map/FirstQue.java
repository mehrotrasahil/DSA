package Map;

import java.util.*;
import java.util.stream.Collectors;

public class FirstQue{

    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();

        map.put("ram", new Employee("ram","HR",3L));
        map.put("sahil", new Employee("sahil","IT",9L));
        map.put("Bharat", new Employee("Bharat","IT",11L));
        map.put("Navneet", new Employee("Navneet","QA",7L));


        List<Employee> employees = getTheData(map);

        for(Employee emp : employees){
            System.out.println(emp.getName());

        }

    }


    private static List<Employee> getTheData(Map<String, Employee> mapData){
/*         List<Employee> res = new ArrayList<>();

        for(Map.Entry<String, Employee> entry : mapData.entrySet()){
            String name = entry.getKey();
            Employee emp = entry.getValue();

            if(emp.getSalary() > 5L){
                res.add(emp);
            }
        }

        return res; */


        return mapData.values().stream()
        .filter(map -> map.getSalary() > 5L)
        .collect(Collectors.toList());
    }

}