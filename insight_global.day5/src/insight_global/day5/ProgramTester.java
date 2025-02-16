package insight_global.day5;

//ProgramTester.java
import java.util.Scanner;

public class ProgramTester {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Create an instance of AverageCalculator
     AverageCalculator calculator = new AverageCalculator();
     
     System.out.print("Enter a number to calculate the average of first n natural numbers: ");
     int n = scanner.nextInt();
     
     try {
         // Call the calAverage method and print the result
         double average = calculator.calAverage(n);
         System.out.println("The average of the first " + n + " natural numbers is: " + average);
     } catch (IllegalArgumentException e) {
         // Catch the exception and print the error message
         System.out.println("Error: " + e.getMessage());
     } finally {
         // Close the scanner
         scanner.close();
     }
 }
}

