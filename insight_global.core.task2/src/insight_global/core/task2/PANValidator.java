package insight_global.core.task2;
//PANValidator.java
public class PANValidator {

 // Static method to validate the PAN number
 public static boolean validatePAN(String pan) {
     // Check if the length is exactly 8 characters
     if (pan.length() != 8) {
         return false;
     }

     // Check if the first three characters are alphabets (A-Z)
     String firstPart = pan.substring(0, 3);
     if (!firstPart.matches("[A-Z]{3}")) {
         return false;
     }

     // Check if the next four characters are digits
     String middlePart = pan.substring(3, 7);
     if (!middlePart.matches("[0-9]{4}")) {
         return false;
     }

     // Check if the last character is an alphabet (A-Z)
     String lastPart = pan.substring(7);
     if (!lastPart.matches("[A-Z]")) {
         return false;
     }

     // If all checks pass, return true
     return true;
 }
}
