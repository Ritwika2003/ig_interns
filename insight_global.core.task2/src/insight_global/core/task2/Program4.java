package insight_global.core.task2;

//Program4.java
import java.util.Scanner;

public class Program4 {
 public static void main(String[] args) {
     // Create a scanner object to read user input
     Scanner scanner = new Scanner(System.in);
     
     // Prompt the user to enter the string
     System.out.println("Enter a string:");
     String input = scanner.nextLine();
     
     // Prompt the user to enter the separator character
     System.out.println("Enter the separator character:");
     char separator = scanner.next().charAt(0);
     
     // Call the reshape method from StringManipulator class
     String result = StringManipulator.reshape(input, separator);
     
     // Print the final transformed string
     System.out.println("Final String: " + result);
     
     // Close the scanner
     scanner.close();
 }
}
