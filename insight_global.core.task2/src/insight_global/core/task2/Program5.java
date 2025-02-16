package insight_global.core.task2;

//Program5.java
import java.util.Scanner;

public class Program5 {
 public static void main(String[] args) {
     // Create a scanner object to read user input
     Scanner scanner = new Scanner(System.in);
     
     // Prompt the user to enter the sentence
     System.out.println("Enter a sentence:");
     String sentence = scanner.nextLine();
     
     // Call the getLastLetter method from StringProcessor class
     String result = StringProcessor.getLastLetter(sentence);
     
     // Print the final result
     System.out.println("Final String: " + result);
     
     // Close the scanner
     scanner.close();
 }
}

