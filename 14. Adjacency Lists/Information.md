## Operations

### Graph Node Definition
   - Define a class named GraphNode with an integer value and a list of neighboring GraphNodes

   - Initialize the list of neighbors in the constructor

### Building the Adjacency List
   - Create a method named buildAdjList to construct an adjacency list

   - Initialize an empty hashmap to store the adjacency list

   - Define an array of edges containing source and destination nodes

   - Initialize an empty hashset to keep track of visited nodes

   - Iterate over each edge:
     - Extract the source and destination nodes
     - If the source node is not present in the adjacency list, add it
     - If the destination node is not present in the adjacency list, add it
     - Add the destination node to the list of neighbors of the source node in the adjacency list

   - Return the constructed adjacency list

### Depth-First Search (DFS) Implementation
   - Create a method named dfs to perform depth-first search

   - Check if the current node has been visited before. If so, return 0

   - Check if the current node is the target node. If so, return 1

   - Initialize a count variable to store the number of paths

   - Mark the current node as visited

   - Iterate over each neighboring node:
     - Recursively call the dfs method on each neighbor
     - Update the count by adding the result of the recursive call

   - Mark the current node as unvisited

   - Return the count

### Breadth-First Search (BFS) Implementation
   - Create a method named `bfs` to perform breadth-first search

   - Initialize a length variable to store the shortest path lengtη

   - Initialize a visit hashset to keep track of visited nodes

   - Initialize a queue to store nodes to be processed

   - Mark the starting node as visited and enqueue it

   - While the queue is not empty:
     - Obtain the size of the queue
     - Iterate over each node in the queue:
       - Dequeue the node
       - If the dequeued node is the target node, return the current length
       - Mark the dequeued node as visited
       - Enqueue all unvisited neighboring nodes
     - Increment the length

   - If the target node is not found, return the length (This should never happen in this specific scenario)
