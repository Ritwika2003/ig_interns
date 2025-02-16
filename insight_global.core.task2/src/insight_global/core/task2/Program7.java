package insight_global.core.task2;

//Program7.java
import java.util.Scanner;

public class Program7 {
 public static void main(String[] args) {
     // Create a scanner object to read user input
     Scanner scanner = new Scanner(System.in);
     
     // Prompt the user to enter the phone number
     System.out.println("Enter a phone number in the format XXX-XXX-XXXX:");
     String phoneNumber = scanner.nextLine();
     
     // Call the convertFormat method from PhoneNumberFormatter class
     String result = PhoneNumberFormatter.convertFormat(phoneNumber);
     
     // Print the final result
     System.out.println("Formatted phone number: " + result);
     
     // Close the scanner
     scanner.close();
 }
}
