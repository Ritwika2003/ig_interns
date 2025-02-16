package insight_global.core;

import java.util.Objects;

//Student class to represent student details
public class Student {
 private String firstName;
 private String lastName;
 private int age;
 private Address address;

 // Constructor
 public Student(String firstName, String lastName, int age, Address address) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.address = address;
 }

 // Getters
 public String getFirstName() {
     return firstName;
 }

 public String getLastName() {
     return lastName;
 }

 public int getAge() {
     return age;
 }

 public Address getAddress() {
     return address;
 }

 // Override equals() and hashCode() based on full name and address
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Student student = (Student) obj;
     return firstName.equals(student.firstName) && lastName.equals(student.lastName) &&
            address.equals(student.address);
 }

 @Override
 public int hashCode() {
     return Objects.hash(firstName, lastName, address);
 }

 @Override
 public String toString() {
     return "Student{" +
             "name='" + firstName + " " + lastName + '\'' +
             ", age=" + age +
             ", address=" + address +
             '}';
 }
}

