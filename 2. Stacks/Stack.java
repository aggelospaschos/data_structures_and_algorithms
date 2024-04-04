import java.util.ArrayList;

// Implementing a stack is trivial using a dynamic array (which we implemented earlier)
public class Stack {

    ArrayList<Integer> stack = new ArrayList<Integer>();

    public Stack() {   
										   // without initializing any actions when the object is created
    }

    public void push(int value) {
    
        stack.add(value);  
    }

    public int pop() {
    
        return stack.remove(stack.size() - 1); 																		    
    }

    public int size() {
    
        return stack.size();               
    }
}