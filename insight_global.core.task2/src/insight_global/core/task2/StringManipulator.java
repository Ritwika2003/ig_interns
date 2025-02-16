package insight_global.core.task2;

//StringManipulator.java
public class StringManipulator {

 // Static method to reverse the string and insert the separator character between each character
 public static String reshape(String input, char separator) {
     // Reverse the string using StringBuilder
     String reversed = new StringBuilder(input).reverse().toString();
     
     // Create a StringBuilder to hold the final result
     StringBuilder result = new StringBuilder();
     
     // Iterate through the reversed string and add separator between characters
     for (int i = 0; i < reversed.length(); i++) {
         result.append(reversed.charAt(i));
         if (i < reversed.length() - 1) {
             result.append(separator); // Add separator only between characters
         }
     }
     
     // Return the final transformed string
     return result.toString();
 }
}

