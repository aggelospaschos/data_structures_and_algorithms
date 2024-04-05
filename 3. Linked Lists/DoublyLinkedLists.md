## What About Doubly Linked Lists

Doubly linked lists have two pointers, one pointing to the next node and one that points to its previous one.

### Initialization

- Initialize a doubly linked list with head and tail sentinel nodes
- Set the head's next pointer to point to the tail
- Set the tail's previous pointer to point to the head

### Insertion at the Front

1. Create a new node with the given value
2. Set the new node's previous pointer to point to the head
3. Set the new node's next pointer to point to the node following the head
4. Update the previous pointer of the node following the head to point to the new node
5. Update the next pointer of the head to point to the new node

### Insertion at the End

1. Create a new node with the given value
2. Set the new node's next pointer to point to the tail
3. Set the new node's previous pointer to point to the node preceding the tail
4. Update the next pointer of the node preceding the tail to point to the new node
5. Update the previous pointer of the tail to point to the new node

### Removal from the Front

1. Update the next pointer of the head to skip over the node following it
2. Update the previous pointer of the node following the head to point to the head

### Removal from the End

1. Update the previous pointer of the tail to skip over the node preceding it.
2. Update the next pointer of the node preceding the tail to point to the tail

### Printing the List

- Start from the node following the head
- While the current node is not the tail: 
  - Print the value of the current node 
  - Move to the next node
