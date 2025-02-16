package insight_global.core.task2;

//Program1.java
import java.util.Scanner;

public class Program1 {
 public static void main(String[] args) {
     // Create a Scanner object to read user input
     Scanner scanner = new Scanner(System.in);
     
     // Prompt the user for a sentence
     System.out.println("Enter a sentence:");
     String sentence = scanner.nextLine();
     
     // Call the getCapitalized method from StringUtils class
     String capitalizedSentence = StringUtils.getCapitalized(sentence);
     
     // Print the capitalized sentence
     System.out.println("Capitalized Sentence: " + capitalizedSentence);
     
     // Close the scanner
     scanner.close();
 }
}

