/* *
 * A large corporation organizes its employee designations in a hierarchical structure. Each designation can have up to two sub-designations reporting to it. Each designation has a specific salary associated with it.
As a part of the HR analytics team, you need to find the Kth smallest salary in the company's hierarchy and share the designation associated with it.
                             CEO (50,000)
                           /               \
    Manager1 (30,000)                            Manager2 (70,000)
      /              \                               /       \
Employee1 (20,000)  Employee2 (40,000) Employee3 (60,000) Employee4 (80,000)


input: [10000, 40000, 70000, 1000, 2000, 60000, 80000]
K = 3
 */

package binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestSalary {
   /** 
     * The Employee class represents an employee in the company's hierarchical structure.
     * Each employee can have up to two sub-designations (employees reporting to them).
     * It holds the salary of the employee and references to the two sub-designations.
     */
    static class Employee {
        int salary; // Salary associated with the employee designation
        Employee employeeDesignation1, employeeDesignation2; // References to the two sub-designations

        /**
         * Constructor to initialize an Employee object with a given salary.
         *
         * @param data The salary for the employee designation.
         */
        Employee(int data) {
            this.salary = data;
            this.employeeDesignation1 = this.employeeDesignation2 = null; // Initialize sub-designations to null
        }
    }

    public static void main(String[] args) {
        int k = 10; // The position of the salary to find (Kth smallest)

        // Constructing the hierarchical structure of employees as a binary tree
        Employee employee = new Employee(10000); // CEO with a salary of 10000
        employee.employeeDesignation1 = new Employee(40000); // Manager1 with a salary of 40000
        employee.employeeDesignation2 = new Employee(70000); // Manager2 with a salary of 70000

        // Setting up sub-designations for Manager1
        employee.employeeDesignation1.employeeDesignation1 = new Employee(2000); // Employee1 with a salary of 2000
        employee.employeeDesignation1.employeeDesignation2 = new Employee(1000); // Employee2 with a salary of 1000

        // Setting up sub-designations for Manager2
        employee.employeeDesignation2.employeeDesignation1 = new Employee(50000); // Employee3 with a salary of 50000
        employee.employeeDesignation2.employeeDesignation2 = new Employee(80000); // Employee4 with a salary of 80000

        List<Integer> salaries = new ArrayList<>(); // List to hold the salaries for sorting

        // Perform in-order traversal of the binary tree to extract salaries
        inOrderTraversal(employee, salaries);

        // Sort the list of salaries to find the Kth smallest salary
        Collections.sort(salaries);

        // Output the Kth smallest salary. Adjusting index as lists are zero-based.
        System.out.println(salaries.get(k - 1));
    }

    /**
     * Performs an in-order traversal of the binary tree to collect salaries.
     * In-order traversal visits the left child, the current node, and then the right child.
     *
     * @param employee The current employee node being visited.
     * @param salary   The list to which the salaries will be added.
     */
    private static void inOrderTraversal(Employee employee, List<Integer> salary) {
        // Base case: If the current employee is null, return
        if (employee == null) {
            return;
        }

        // Traverse the left subtree (sub-designation 1)
        inOrderTraversal(employee.employeeDesignation1, salary);

        // Add the current employee's salary to the list
        salary.add(employee.salary);

        // Traverse the right subtree (sub-designation 2)
        inOrderTraversal(employee.employeeDesignation2, salary);
    }
}