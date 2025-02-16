package insight_global.day5;

public class Stack {
	
	    private Contact[] stack;
	    private int top;
	    private int capacity;

	    // Constructor to initialize stack
	    public Stack(int capacity) {
	        this.capacity = capacity;
	        this.stack = new Contact[capacity];
	        this.top = -1;
	    }

	    // Push method
	    public void push(Contact contact) throws Exception {
	        if (top == capacity - 1) {
	            throw new Exception("Stack Overflow: Cannot push to a full stack.");
	        }
	        if (contact == null || !contact.validate()) {
	            throw new Exception("Invalid Contact: Contact validation failed.");
	        }
	        stack[++top] = contact;
	    }

	    // Pop method
	    public Contact pop() throws Exception {
	        if (top == -1) {
	            throw new Exception("Stack Underflow: Cannot pop from an empty stack.");
	        }
	        return stack[top--];
	    }

	    // Peek method (optional)
	    public Contact peek() throws Exception {
	        if (top == -1) {
	            throw new Exception("Stack is empty.");
	        }
	        return stack[top];
	    }

	    // Check if stack is empty
	    public boolean isEmpty() {
	        return top == -1;
	    }

	    // Check if stack is full
	    public boolean isFull() {
	        return top == capacity - 1;
	    }

	    // Method to get the current size of the stack
	    public int size() {
	        return top + 1;
	    }
	


}
