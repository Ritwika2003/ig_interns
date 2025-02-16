package insight_global.day2;

public class ParamPassingDemo1 {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student(101, "John");
        int number = 5;
        String name = "Alice";

        // Print initial data before calling modify methods
        System.out.println("Before modify() call:");
        System.out.println("Number: " + number);
        System.out.println("Student Rollno: " + student.getRollNo());
        System.out.println("Student Name: " + student.getFname());

        // Call modify methods
        student.modify(number); // Pass primitive type int
        student.modify(student); // Pass Student object
        student.modify(name);    // Pass String object

        // Print final data after modify methods
        System.out.println("\nAfter modify() call:");
        System.out.println("Number: " + number); // This should be unchanged
        System.out.println("Student Rollno: " + student.getRollNo()); // This should be incremented
        System.out.println("Student Name: " + student.getFname()); // This should be changed to "Updated"
    }
}

