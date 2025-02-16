package insight_global.core.task2;

//PhoneNumberFormatter.java
public class PhoneNumberFormatter {

 // Static method to convert the phone number format
 public static String convertFormat(String phoneNumber) {
     // Remove all the hyphens from the input string
     String digits = phoneNumber.replace("-", "");
     
     // Ensure the number has exactly 10 digits
     if (digits.length() != 10) {
         return "Invalid input";
     }
     
     // Build the new phone number format
     String formatted = digits.substring(0, 2) + "-" 
                      + digits.substring(2, 4) + "-" 
                      + digits.substring(4, 7) + "-" 
                      + digits.substring(7, 10);
     
     // Return the formatted phone number
     return formatted;
 }
}

