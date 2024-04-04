public class StaticArray {

    // Insert n into arr at the next open position
    // Length is the number of 'real' values in arr, and capacity
    // is the size (memory allocated in RAM for the fixed size array)
    
    public void insertEnd(int[] array, int value, int length, int capacity) {
    
        if (length < capacity) {
        
            array[length] = value;     
        }
    }    
            
    // Remove from the last position in the array if the array
    // is not empty (i.e. length is non-zero)
    
    public void removeEnd(int[] array, int length) {
    
        if (length > 0) {          
        
            array[length - 1] = 0;   
            length--;             
        }
    }        

    // Insert n into index i after shifting elements to the right
    // Assuming i is a valid index and arr is not full
    
    public void insertMiddle(int[] array, int i, int value, int length) {
    
        // Shift starting from the end to i
        for (int index = length - 1; index > i - 1; index--) {
        
            array[index + 1] = array[index];
        }
        
        array[i] = value;
    }

    // Remove value at index i before shifting elements to the left
    // assuming i is a valid index
    
    public void removeMiddle(int[] array, int i, int length) {
    
        // Shift starting from i + 1 to end
        for (int index = i + 1; index < length; index++) {
        
            array[index - 1] = arr[index];
        } 
        // No need to 'remove' arr[i], since we already shifted
    }

    public void printArray(int[] array, int length) {
    
        for (int i = 0; i < length; i++) {
        
            System.out.print(array[i] + " ");
        }      
        
        System.out.println();
    }
}    