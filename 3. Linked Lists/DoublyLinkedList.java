/*
public class DoublyLinkedListNode {
    
    int value;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int value) {
        this.valie = value;
        this.next = null;
        this.prev = null;
    }
}
*/

// Implementation for Doubly Linked List
public class DoublyLinkedList {

    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    public DoublyLinkedList() {  
                  
        head = new DoublyLinkedListNode(-1);  
        tail = new DoublyLinkedListNode(-1);
        head.next = tail;                                 
        tail.prev = head;                     
    }

    public void insertFront(int value) {
    
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(value); 
																																      
        newNode.prev = head;                                          
        newNode.next = head.next;                                      
        
        head.next.prev = newNode;
        head.next = newNode;
    }

    public void insertEnd(int value) {
    
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(value);
        newNode.next = tail;
        newNode.prev = tail.prev;
        
        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    public void removeFront() {
    
        head.next.next.prev = head;
        head.next = head.next.next;
    }   

    public void removeEnd() {
    
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
    }   
    
    public void print() {
    
        DoublyLinkedListNode curr = head.next;
        while (current != tail) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }           
        System.out.println();
    }
}