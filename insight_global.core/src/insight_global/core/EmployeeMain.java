package insight_global.core;

//EmployeeMain.java
import java.util.*;

public class EmployeeMain {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     EmployeeOperations employeeOperations = new EmployeeOperations();

     // Create a set of employees
     Set<Employee> employees = employeeOperations.createEmployeeSet();

     boolean continueRunning = true;

     while (continueRunning) {
         System.out.println("\nMenu:");
         System.out.println("1. Display all employees");
         System.out.println("2. Sort employees by EmpId");
         System.out.println("3. Sort employees by First Name");
         System.out.println("4. Exit");
         System.out.print("Choose an option: ");

         int choice = scanner.nextInt();
         scanner.nextLine(); // consume newline

         switch (choice) {
             case 1:
                 System.out.println("All Employees:");
                 employees.forEach(System.out::println);
                 break;
             case 2:
                 employeeOperations.sortByEmpId(employees);
                 break;
             case 3:
                 employeeOperations.sortByFirstName(employees);
                 break;
             case 4:
                 continueRunning = false;
                 System.out.println("Exiting...");
                 break;
             default:
                 System.out.println("Invalid option, please try again.");
         }
     }

     scanner.close();
 }
}

