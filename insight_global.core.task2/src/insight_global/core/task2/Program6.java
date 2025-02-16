package insight_global.core.task2;

//Program6.java
import java.util.Scanner;

public class Program6 {
 public static void main(String[] args) {
     // Create a scanner object to read user input
     Scanner scanner = new Scanner(System.in);
     
     // Prompt the user to enter the string
     System.out.println("Enter a string:");
     String input = scanner.nextLine();
     
     // Call the calculateWordSum method from WordProcessor class
     int result = WordProcessor.calculateWordSum(input);
     
     // Print the final result
     System.out.println(result);
     
     // Close the scanner
     scanner.close();
 }
}

