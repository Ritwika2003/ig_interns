package insight_global.core.task2;

//StringUtils.java
public class StringUtils {
 // Static method to capitalize the first letter of each word in the sentence
 public static String getCapitalized(String sentence) {
     // Split the sentence into words using space as the delimiter
     String[] words = sentence.split(" ");
     
     StringBuilder capitalizedSentence = new StringBuilder();
     
     // Iterate through each word
     for (String word : words) {
         // Capitalize the first letter and make the rest lowercase
         if (!word.isEmpty()) {
             capitalizedSentence.append(word.substring(0, 1).toUpperCase());
             capitalizedSentence.append(word.substring(1).toLowerCase());
         }
         capitalizedSentence.append(" "); // Add a space after each word
     }
     
     // Return the final string with capitalized words
     return capitalizedSentence.toString().trim();
 }
}

