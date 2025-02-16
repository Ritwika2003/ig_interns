package insight_global.day2;

//Student class containing rollno and fname
class Student {
 private int rollNo;
 private String fname;

 // Constructor to initialize rollNo and fname
 public Student(int rollNo, String fname) {
     this.rollNo = rollNo;
     this.fname = fname;
 }

 // Getter methods
 public int getRollNo() {
     return rollNo;
 }

 public String getFname() {
     return fname;
 }

 // Method to modify an int (primitive type)
 public void modify(int number) {
     number++; // Increment the number, but this change is local to this method.
     System.out.println("Inside modify(int): Number incremented to " + number);
 }

 // Method to modify a Student object (user-defined type)
 public void modify(Student student) {
     student.rollNo++; // Increment the rollNo of the student
     System.out.println("Inside modify(Student): Rollno incremented to " + student.getRollNo());
 }

 // Method to modify a String (immutable type)
 public void modify(String name) {
     this.fname = "Updated"; // Change fname to a new value
     System.out.println("Inside modify(String): Name changed to " + this.fname);
 }
}

