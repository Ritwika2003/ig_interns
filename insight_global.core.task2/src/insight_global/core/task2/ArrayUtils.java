package insight_global.core.task2;

//ArrayUtils.java
public class ArrayUtils {
 
 // Static method to find the index of the larger number of the two adjacent numbers with the largest difference
 public static Integer findMaxDistance(int[] arr, int n) {
     // Initialize variables to store the maximum difference and the index of the larger number
     int maxDiff = -1;
     int index = -1;
     
     // Iterate through the array to find the largest difference between adjacent elements
     for (int i = 0; i < n - 1; i++) {
         int diff = Math.abs(arr[i] - arr[i + 1]);
         if (diff > maxDiff) {
             maxDiff = diff;
             // Choose the larger of the two adjacent numbers and store its index
             if (arr[i] > arr[i + 1]) {
                 index = i;
             } else {
                 index = i + 1;
             }
         }
     }
     
     // Return the index of the larger number
     return index;
 }
}

