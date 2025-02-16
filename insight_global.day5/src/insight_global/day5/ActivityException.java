package insight_global.day5;

//com/ig/exception/ActivityException.java


public class ActivityException extends Exception {
 
 // Constructor accepting a custom message
 public ActivityException(String message) {
     super(message);
 }
 
 // Constructor with message and cause
 public ActivityException(String message, Throwable cause) {
     super(message, cause);
 }
}

