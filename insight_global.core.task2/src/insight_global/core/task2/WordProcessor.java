package insight_global.core.task2;

//WordProcessor.java
public class WordProcessor {

 // Static method to calculate word sum based on the rules
 public static int calculateWordSum(String input) {
     // Split the string into words
     String[] words = input.split("\\s+");
     
     // Check if there are any words in the input
     if (words.length == 0) {
         return 0;  // Return 0 if the input string is empty
     }

     // Get the first and last word from the string
     String firstWord = words[0];
     String lastWord = words[words.length - 1];

     // Check if the first and last word are the same (case-sensitive comparison)
     if (firstWord.equals(lastWord)) {
         // Return the length of the word if they are the same
         return firstWord.length();
     } else {
         // Return the sum of the lengths of both words if they are different
         return firstWord.length() + lastWord.length();
     }
 }
}

