## What are Graphs ?

Linked lists, trees, and heaps are data structures that can be represented as graphs. In a linked list, each node (vertex) contains a value and a pointer to the next node, forming a chain of nodes connected by edges. In a tree, each node (except the root) has a parent node and zero or more child nodes, forming a hierarchical structure.
Trees are a special case of graphs known as directed acyclic graphs (DAGs). A heap is a binary tree with additional properties (e.g., min-heap or max-heap). Like trees, heaps are also a type of graph.
In graphs, nodes (or vertices) represent entities, and pointers or references between nodes represent connections or relationships, which are called edges.

**e ≤ v^2:** The number of edges (e) in a graph is less than or equal to the square of the number of vertices (v). However, this is not necessarily true for all types of graphs. In some cases, a graph may have fewer edges than v^2 (e.g., sparse graphs), while in other cases, it may have more edges than v^2 (e.g., dense graphs).

**G(V,E):** This notation represents a graph G with vertices V and edges E, which is a standard way to describe a graph. V is the set of vertices or nodes in the graph, and E is the set of edges or connections between vertices.

### Matrix (DFS)

To count paths in a grid using depth-first search (DFS) with backtracking:

1. Start by defining the `DFS` function, which takes the grid, 
	current row index (`r`), 
	current column index (`c`), and visit matrix as parameters

2. Obtain the number of rows (`ROWS`) and columns (`COLS`) in the grid

3. Check if either the current row index or the current column index is less than 0, 
	or if the current row index exceeds the total number of rows (`ROWS`), 
	or if the current column index exceeds the total number of columns (`COLS`), 
	or if the current cell has already been visited (marked as 1 in the visit matrix), 
	or if the current cell is blocked (`grid[r][c] equals 1`)
	If any of these conditions are met, return 0, indicating that there are no valid paths through this cell

4. Check if the current cell is at the bottom-right corner of the grid (`r` equals `ROWS - 1` and `c` equals `COLS - 1`).
	If so, return 1, indicating that a valid path has been found

5. Mark the current cell as visited by setting the corresponding entry in the visit matrix to 1

6. Initialize a variable named count to store the total number of valid paths from the current cell

7. Recursively explore the neighboring cells of the current cell:
   - Move down: Call the DFS function with the row index incremented by 1 and the column index unchanged
   - Move up: Call the DFS function with the row index decremented by 1 and the column index unchanged
   - Move right: Call the DFS function with the row index unchanged and the column index incremented by 1
   - Move left: Call the DFS function with the row index unchanged and the column index decremented by 1

8. Add up the counts obtained from each recursive call and store the result in the count variable

9. After exploring all possible paths from the current cell, 
	mark the current cell as unvisited by setting the corresponding entry in the visit matrix back to 0

10. Return the total count of valid paths obtained from all recursive calls

### Matrix (BFS)

To find the shortest path from the top-left corner to the bottom-right corner in a grid using breadth-first search (BFS):

1. Create a 2D grid representing the matrix

2. Define a method named `bfs` that takes the grid as a parameter

3. Obtain the number of rows (`ROWS`) and columns (`COLS`) in the grid

4. Initialize a 2D array named visit to keep track of visited cells. Initially, set all values to 0

5. Create a deque (double-ended queue) named queue to store cell coordinates

6. Add the starting cell coordinates (0, 0) to the queue and mark it as visited

7. Initialize a variable named length to keep track of the shortest path length

8. While the queue is not empty, repeat the following steps:
   a. Obtain the number of elements currently in the queue
   b. Iterate through each element in the queue:
      i. Remove the first element (cell coordinates) from the queue
      ii. Check if the current cell is the bottom-right corner of the grid. 
		     If so, return the current length, as it represents the shortest path length
      iii. Generate the coordinates of the neighboring cells (up, down, left, right)
      iv. For each neighboring cell:
          - Check if it is within the bounds of the grid and has not been visited before
          - Check if it is not blocked (grid value equals 1)
          - If the above conditions are met, add the neighboring cell coordinates to the queue and mark it as visited
   c. Increment the length of the shortest path

9. If the loop completes without finding a path, return the length (This should not happen in this specific scenario, as there is always a path from the top-left corner to the bottom-right corner in the given grid.)