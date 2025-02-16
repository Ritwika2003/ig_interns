package insight_global.core;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Creating address objects
        Address address1 = new Address("123 Main St", "Springfield", "IL", "62701");
        Address address2 = new Address("456 Oak St", "Chicago", "IL", "60601");

        // Creating student objects
        Student student1 = new Student("John", "Doe", 20, address1);
        Student student2 = new Student("Jane", "Doe", 22, address1);
        Student student3 = new Student("John", "Doe", 20, address1);  // Same name and address as student1
        Student student4 = new Student("John", "Doe", 20, address2);  // Same name, different address

        // Creating a HashSet of students
        HashSet<Student> studentSet = new HashSet<>();

        // Adding students to the HashSet
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3); // Should not be added as it is duplicate
        studentSet.add(student4);  // Should be added, as it has a different address

        // Printing the students in the set
        System.out.println("Students in the HashSet:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}

