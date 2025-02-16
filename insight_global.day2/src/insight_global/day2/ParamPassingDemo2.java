package insight_global.day2;

public class ParamPassingDemo2 {
    public static void main(String[] args) {
        // Initialize two integers
        int a = 5;
        int b = 10;

        // Initialize two integer arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Print data before swapping
        System.out.println("Before swap method call:");
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("array1: " + arrayToString(array1));
        System.out.println("array2: " + arrayToString(array2));

        // Call the swap methods
        swap(a, b); // Swap two integers
        swap(array1, array2); // Swap two arrays

        // Print data after swapping
        System.out.println("\nAfter swap method call:");
        System.out.println("a: " + a + ", b: " + b); // Primitives will not be affected
        System.out.println("array1: " + arrayToString(array1)); // Arrays will be swapped
        System.out.println("array2: " + arrayToString(array2)); // Arrays will be swapped
    }

    // Method to swap two integers
    public static void swap(int x, int y) {
        System.out.println("Inside swap(int, int): Swapping x = " + x + " and y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap(int, int): x = " + x + " and y = " + y);
    }

    // Method to swap two integer arrays
    public static void swap(int[] array1, int[] array2) {
        System.out.println("Inside swap(int[], int[]): Swapping arrays...");
        int[] temp = array1;
        array1 = array2;
        array2 = temp;
        // Print the reference swap (not the array content swap yet)
        System.out.println("Inside swap(int[], int[]): array1 and array2 references swapped.");
    }

    // Utility method to convert array to a string for printing
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}

