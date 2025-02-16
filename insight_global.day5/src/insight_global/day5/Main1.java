package insight_global.day5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
        try {
            // Create stack of size 3
            Stack stack = new Stack(3);

            // Creating sample Contact objects
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dob = sdf.parse("15/08/1990");

            Contact contact1 = new Contact("John", "A.", "Doe", dob, "Male", "1234567890");
            Contact contact2 = new Contact("Jane", "B.", "Doe", dob, "Female", "9876543210");

            // Push contacts to stack
            stack.push(contact1);
            stack.push(contact2);

            // Peek the top element
            System.out.println("Top of the stack: " + stack.peek());

            // Pop the top element
            System.out.println("Popped from stack: " + stack.pop());

            // Try to pop from an empty stack
            System.out.println("Popped from stack: " + stack.pop());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

