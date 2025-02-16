package insight_global.day5;
//InvalidOperatorException.java


public class InvalidOperatorException extends Exception {

 // Constructor accepting a message
 public InvalidOperatorException(String message) {
     super(message);
 }

 // Constructor accepting a message and a cause
 public InvalidOperatorException(String message, Throwable cause) {
     super(message, cause);
 }
}

