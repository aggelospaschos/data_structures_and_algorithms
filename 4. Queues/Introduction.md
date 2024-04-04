## Introduction

Queues are a First-In-First-Out data structure and it’s mostly applied with linked lists. They use constant time operations for enqueing and dequeing.

### Operations

To enqueue an object value: 

1. Check if the queue is not empty
2. If not empty:
   a. Create a new list node with the given value
   b. Set the next pointer of the current right list node to point to the new list node
   c. Update the right pointer of the queue to point to the new list node
3. If the queue is empty:
   a. Create a new list node with the given value
   b. Set both left and right pointers of the queue to point to the new list node

To dequeue an object:

1. Check if the queue is not empty
2. If not empty:
   a. Assign the value of the left list node in the queue to a variable
   b. Update the left pointer of the queue to point to the next list node
   c. Return the stored value
3. If the queue is empty, handle accordingly (e.g., throw an exception or exit the program)