// public class ListNode {
//     int value;
//     ListNode next;
//
//     public ListNode(int value) {
//         this.value = value;
//         this.next = null;
//     }
// }

public class Queue {

    ListNode left;  // front of Queue   front -> [1,2,3]
    ListNode right; // back of Queue   [1,2,3] <- back
    
    public Queue() {
    
        this.left  = null;
        this.right = null;
    }

    public void enqueue(int value) {
    
        ListNode newNode = new ListNode(value);
        if (this.right != null) { 
        // Queue is not empty 
        
            this.right.next = newNode;
            this.right = this.right.next;
        } else {       
        // Queue is empty    
                 
            this.left = newNode;
            this.right = newNode;
        }
    }

    public int dequeue() {
    
        if (this.left == null) {
        // Queue is empty 
        
            System.exit(0);
        }
        int value = this.left.value;
        this.left = this.left.next;
        return value;
        
    }

    public void print() {
    
        ListNode current = this.left;
        while(current != null) {
        
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println();
    }

}