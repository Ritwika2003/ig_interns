package insight_global.core.task2;

//Program2.java
import java.util.Scanner;

public class Program2 {
 public static void main(String[] args) {
     // Create a scanner object to read user input
     Scanner scanner = new Scanner(System.in);
     
     // Prompt the user to input the number of elements in the array
     System.out.println("Enter the number of elements:");
     int n = scanner.nextInt();
     
     // Declare and initialize the array based on the user input
     int[] arr = new int[n];
     
     // Prompt the user to enter the elements of the array
     System.out.println("Enter the elements of the array:");
     for (int i = 0; i < n; i++) {
         arr[i] = scanner.nextInt();
     }
     
     // Call the findMaxDistance method from ArrayUtils class to find the index
     Integer index = ArrayUtils.findMaxDistance(arr, n);
     
     // Print the index of the larger number with the largest difference
     System.out.println("Index of the larger number with the maximum difference: " + index);
     
     // Close the scanner
     scanner.close();
 }
}


