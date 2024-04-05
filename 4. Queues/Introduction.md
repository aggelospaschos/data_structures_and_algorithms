## Introduction

Queues are a First-In-First-Out data structure and it’s mostly applied with linked lists. They use constant time operations for enqueing and dequeing.

### Operations

**To enqueue an object value:**

- Check if the queue is not empty
  - If not empty:
    - Create a new list node with the given value
    - Set the next pointer of the current right list node to point to the new list node
    - Update the right pointer of the queue to point to the new list node
  - If the queue is empty:
    - Create a new list node with the given value
    - Set both left and right pointers of the queue to point to the new list node

**To dequeue an object:**

- Check if the queue is not empty
  - If not empty:
    - Assign the value of the left list node in the queue to a variable
    - Update the left pointer of the queue to point to the next list node
    - Return the stored value
- If the queue is empty, handle accordingly (e.g., throw an exception or exit the program)
