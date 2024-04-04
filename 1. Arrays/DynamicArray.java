public class DynamicArray {
    
    int capacity;
    int length;;
    int[] arr;

    public DynamicArray() {  
													 
        capacity = 2;       
        length = 0;        
        array = new int[2];  
    }
    
    public void pushback(int value) {
    
        if (length == capacity) { 
													        
            this.resize();       
        }
               
        array[length] = value;        
        length++;                
    }

    public void resize() {
    
        capacity = 2 * capacity;          
        int[] newArray = new int[capacity];  
        
        for (int i = 0; i < length; i++) { 
        
            newArray[i] = array[i];           
                                           
        }
        array = newArray;                 
    }  

    public void popback() {
    
        if (length > 0) {   
         
            length--;       
        }  
    }     

    public int get(int i) {
    
        if (i < length) {    
        
            return array[i];   
        }    
        return -1;           // Here we would throw an out of bounds exception
    }    

    public void insert(int i, int value) {
    
        if (i < length) {
                        
            array[i] = value;                  
            return;
        }    
        return;
        // Here we would throw an out of bounds exception  
    }        

    public void print() {
    
        for (int i = 0; i < length; i++) {
        
            System.out.println(array[i]);  
        }
    }
} 