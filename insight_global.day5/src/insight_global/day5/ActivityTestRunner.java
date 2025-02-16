package insight_global.day5;

//ActivityTestRunner.java
import insight_global.day5.Activity;
import insight_global.day5.ActivityProcessor;
import insight_global.day5.ActivityException;

public class ActivityTestRunner {

 public static void main(String[] args) {
     
     // Create a sample activity
     Activity activity1 = new Activity("Hello", "World", "concat");
     Activity activity2 = new Activity("Apple", "apple", "compare");
     
     // Create the processor to process activities
     ActivityProcessor processor = new ActivityProcessor();
     
     try {
         // Process activity1
         processor.processActivity(activity1);
         
         // Process activity2
         processor.processActivity(activity2);
         
     } catch (ActivityException e) {
         // Handle exceptions thrown by ActivityProcessor
         System.out.println("Error: " + e.getMessage());
     }
 }
}

