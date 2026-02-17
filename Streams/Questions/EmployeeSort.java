package Streams.Questions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeSort {

    public static class Employee {
        String emailId;
        String name;
        String department;

        public Employee(String emailId, String name, String department) {
            this.emailId = emailId;
            this.name = name;
            this.department = department;
        }

        public String getEmailId() {
            return emailId;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!(obj instanceof Employee))
                return false;
            Employee other = (Employee) obj;
            return Objects.equals(emailId, other.emailId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(emailId);
        }

        public static void main(String[] args) {
            Map<Employee, Integer> empMap = new HashMap<>();
            empMap.put(new Employee("sahil@gmail.com", "Sahil Mehrotra", "IT"), 14);
            empMap.put(new Employee("Manoj@gmail.com", "Manoj Kumar", "DevOps"), 15);
            empMap.put(new Employee("pritam@gmail.com", "Pritam Pyarre", "IT"), 22);
            empMap.put(new Employee("Chaitanya@gmail.com", "Chaitanua Anand", "QA"), 20);

            Map<Employee, Integer> sortedMap = empMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new));

            for (Map.Entry<Employee, Integer> printMap : sortedMap.entrySet()) {
                Employee key = printMap.getKey();
                System.out.println(key.getEmailId());
            }
        }
    }
}
