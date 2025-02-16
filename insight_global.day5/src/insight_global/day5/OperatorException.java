package insight_global.day5;

//OperatorException.java


//Custom exception class for handling invalid operator scenarios
public class OperatorException extends Exception {
 
 // Constructor accepting a custom error message
 public OperatorException(String message) {
     super(message);
 }
 
 // Constructor accepting a custom message and cause (another exception)
 public OperatorException(String message, Throwable cause) {
     super(message, cause);
 }
}
