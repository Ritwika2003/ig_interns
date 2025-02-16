package insight_global.core.task2;

//StringProcessor.java
public class StringProcessor {

 // Static method to return the concatenation of the last letter of each word in uppercase
 public static String getLastLetter(String sentence) {
     // Split the sentence into words
     String[] words = sentence.split("\\s+");
     
     // StringBuilder to hold the result
     StringBuilder result = new StringBuilder();
     
     // Iterate over each word and get the last letter, then append it in uppercase
     for (String word : words) {
         // Ensure the word is not empty, then add the last letter in uppercase
         if (word.length() > 0) {
             result.append(Character.toUpperCase(word.charAt(word.length() - 1)));
         }
     }
     
     // Return the final result string
     return result.toString();
 }
}

