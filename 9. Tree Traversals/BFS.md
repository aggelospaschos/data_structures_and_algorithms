## Level Order Traversal (Breadth-First Search)

### Initialization
Create an empty queue

### Traversal Process
1. Enqueue the root node into the queue
2. Initialize the level counter to 0
	a. While the queue is not empty:
		 i. Print the current level
	  ii. Get the number of nodes at the current level
	b. For each node at the current level:
		i. Dequeue a node from the queue
	c. Print its value
3. Enqueue its left child if it exists
4. Enqueue its right child if it exists
5. Move to the next level