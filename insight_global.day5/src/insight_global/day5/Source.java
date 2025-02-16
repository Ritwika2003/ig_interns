package insight_global.day5;

import insight_global.day5.ActivityDetails;
import insight_global.day5.InvalidOperatorException;

public class Source {

    public static void main(String[] args) {
        // Create an ActivityDetails object with sample data
        ActivityDetails activity = new ActivityDetails("Hello", "Welcome", "+");
        Source source = new Source();

        try {
            // Validate the activity
            if (!source.validate(activity)) {
                throw new InvalidOperatorException("Invalid parameters");
            }

            // Perform the operation
            String result = source.doOperation(activity);
            System.out.println(result);

        } catch (InvalidOperatorException e) {
            // Handle the exception and print the stack trace
            e.printStackTrace();
        }
    }

    // Method to validate the activity and throw InvalidOperatorException
    public boolean validate(ActivityDetails activity) throws InvalidOperatorException {
        // Check if any string or operator is null
        if (activity.getString1() == null || activity.getString2() == null || activity.getOperator() == null) {
            throw new NullPointerException("String1, String2, or Operator cannot be null");
        }

        // Check for valid operators
        String operator = activity.getOperator();
        if (!operator.equals("+") && !operator.equals("-")) {
            throw new InvalidOperatorException("Invalid operator. Only '+' or '-' are allowed.");
        }

        return true; // Return true if validation passed
    }

    // Method to perform the operation based on the operator
    public String doOperation(ActivityDetails activity) {
        String operator = activity.getOperator();
        String string1 = activity.getString1();
        String string2 = activity.getString2();

        // If operator is '+', concatenate string1 and string2
        if (operator.equals("+")) {
            return string1 + string2;
        }

        // If operator is '-', remove characters in string2 from string1
        if (operator.equals("-")) {
            String result = string1;
            for (char c : string2.toCharArray()) {
                result = result.replaceFirst(String.valueOf(c), ""); // Remove the first occurrence of each character in string2 from string1
            }
            return result;
        }

        // Default return (this case should never occur due to validation)
        return null;
    }
}
