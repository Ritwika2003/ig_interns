package insight_global.core;

//Employee.java
public class Employee {
 private int empId;
 private String firstName;
 private String lastName;

 // Constructor
 public Employee(int empId, String firstName, String lastName) {
     this.empId = empId;
     this.firstName = firstName;
     this.lastName = lastName;
 }

 // Getters
 public int getEmpId() {
     return empId;
 }

 public String getFirstName() {
     return firstName;
 }

 public String getLastName() {
     return lastName;
 }

 // Overriding equals() and hashCode() to avoid duplicates based on empId and name
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Employee employee = (Employee) obj;
     return empId == employee.empId && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
 }

 @Override
 public int hashCode() {
     int result = Integer.hashCode(empId);
     result = 31 * result + firstName.hashCode();
     result = 31 * result + lastName.hashCode();
     return result;
 }

 // toString method for better display
 @Override
 public String toString() {
     return "Employee{empId=" + empId + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
 }
}

