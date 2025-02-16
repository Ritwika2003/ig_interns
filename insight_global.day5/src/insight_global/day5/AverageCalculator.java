package insight_global.day5;

//AverageCalculator.java
public class AverageCalculator {
 
 // Method to calculate the average of first n natural numbers
 public double calAverage(int n) {
     // Check if n is a natural number (positive integer)
     if (n <= 0) {
         throw new IllegalArgumentException("Input must be a natural number greater than 0.");
     }
     
     // Sum of first n natural numbers is n * (n + 1) / 2
     double sum = (n * (n + 1)) / 2.0;
     
     // Calculate average
     return sum / n;
 }
}

