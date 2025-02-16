package insight_global.day5;

//com/ig/processor/ActivityProcessor.java


import insight_global.day5.Activity;
import insight_global.day5.ActivityException;

public class ActivityProcessor {

 // Method to process the activity based on operator
 public void processActivity(Activity activity) throws ActivityException {
     
     // Get the operator from the activity
     String operator = activity.getOperator();
     
     // Check for empty strings or invalid operator
     if (activity.getString1().isEmpty() || activity.getString2().isEmpty()) {
         throw new ActivityException("String values must not be empty.");
     }
     
     // Handle the different operators (just an example with simple operations)
     switch (operator) {
         case "concat":
             System.out.println("Concatenation result: " + activity.getString1() + activity.getString2());
             break;
         case "compare":
             if (activity.getString1().equals(activity.getString2())) {
                 System.out.println("Strings are equal.");
             } else {
                 System.out.println("Strings are not equal.");
             }
             break;
         default:
             throw new ActivityException("Invalid operator: " + operator);
     }
 }
}

