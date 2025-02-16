package insight_global.core;

//EmployeeOperations.java
import java.util.*;

public class EmployeeOperations {

 // Method to create and return a Set of Employees
 public Set<Employee> createEmployeeSet() {
     Set<Employee> employees = new TreeSet<>(new EmpIdComparator()); // Default: sorted by empId
     employees.add(new Employee(101, "Alice", "Johnson"));
     employees.add(new Employee(102, "Bob", "Smith"));
     employees.add(new Employee(103, "Charlie", "Brown"));
     employees.add(new Employee(104, "Diana", "Davis"));
     employees.add(new Employee(105, "Eva", "Wilson"));
     employees.add(new Employee(106, "Frank", "Taylor"));

     // Adding duplicate employee (won't be added due to the use of TreeSet)
     employees.add(new Employee(101, "Alice", "Johnson"));

     return employees;
 }

 // Method to sort employees by empId
 public void sortByEmpId(Set<Employee> employees) {
     System.out.println("\nEmployees sorted by EmpId:");
     employees.forEach(System.out::println);
 }

 // Method to sort employees by firstName
 public void sortByFirstName(Set<Employee> employees) {
     Set<Employee> sortedByFirstName = new TreeSet<>(new FirstNameComparator());
     sortedByFirstName.addAll(employees);
     
     System.out.println("\nEmployees sorted by First Name:");
     sortedByFirstName.forEach(System.out::println);
 }
}
