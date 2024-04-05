## Level Order Traversal (Breadth-First Search)

### Initialization
- Create an empty queue

### Traversal Process
1. **Enqueue the root node into the queue**
2. **Initialize the level counter to 0**
   - **While the queue is not empty:**
     - **Print the current level**
     - **Get the number of nodes at the current level**
       - **For each node at the current level:**
         - **Dequeue a node from the queue**
         - **Print its value**
         - **Enqueue its left child if it exists**
         - **Enqueue its right child if it exists**
     - **Move to the next level**
