package insight_global.core.task2;

//Program3.java
import java.util.Scanner;

public class Program3 {
 public static void main(String[] args) {
     // Create a scanner object to read user input
     Scanner scanner = new Scanner(System.in);
     
     // Prompt the user to enter the PAN number
     System.out.println("Enter the PAN number:");
     String pan = scanner.nextLine();
     
     // Call the validatePAN method from PANValidator class to validate the PAN number
     boolean isValid = PANValidator.validatePAN(pan);
     
     // Print the result based on the validation
     if (isValid) {
         System.out.println("Valid");
     } else {
         System.out.println("Invalid");
     }
     
     // Close the scanner
     scanner.close();
 }
}

