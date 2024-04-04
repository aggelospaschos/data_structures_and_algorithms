/*
public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
*/

// Implementation for Singly Linked List
public class SinglyLinkedList {

    ListNode head;
    ListNode tail;

    public SinglyLinkedList() { 
    
        head = new ListNode(-1);
        tail = head;            
    }

    public void insertEnd(int val) {
    
        tail.next = new ListNode(val); 
        tail = tail.next;             
    }

    public void remove(int index) {
    
        int i = 0;                          
        ListNode current = head;              
        while (i < index && current != null) { 
																			
            i++;                           
            current = current.next;               
        }
        
        if (current != null) {               
            current.next = current.next.next;     
																		        
        }
    }

    public void print() {
    
        ListNode current = head.next;        
        while (current != null) {      
																		      
            System.out.print(current.value + " -> "); 
            current = current.next;                   
        }

        System.out.println();
    }
    
}