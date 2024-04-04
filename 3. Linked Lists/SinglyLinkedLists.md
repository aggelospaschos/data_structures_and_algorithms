### Singly Linked Lists

Singly linked lists are objects that have one pointer. 

A node in a singly linked list could be the whole linked list `head = new ListNode` , `tail = head`

To insert a node at the end of a singly linked list:

1. Set the pointer of the tail to point to a new list node with the given value: `tail.next = new ListNode(value)`
2. Update the tail pointer to point to the new node: `tail = tail.next`

To remove a node from a singly linked list:

1. Initialize a current node to point to the head of the list: `current = head`
2. Iterate through the list until the desired index or until current is null:
    a. Move to the next node: `current = current.next`
3. If current is not null (indicating that the index is within bounds):
    a. Set the next pointer of the current node to skip over the next node: `current.next = current.next.next`