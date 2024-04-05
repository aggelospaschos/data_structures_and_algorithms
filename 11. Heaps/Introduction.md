## What are Heaps?

Heaps are a complete binary tree data structure that implements priority queues. In heaps, every node has a child less than or equal to its value (max heap) or greater than or equal to its value (min heap).

### Initialization

Create an empty list to represent the heap. The first element is initialized as 0 for easier indexing.

### Push (Insertion)

- Append the new value to the end of the list.
- Get the index of the new element.
- Percolate up:
  - While the current element is smaller than its parent and not at the root:
    - Swap the current element with its parent.
    - Update the index to the parent's index.

### Pop (Removal)

- Check if the heap has only one element. If yes, return that element.
- Otherwise, remove the root element (the minimum or maximum value).
- Move the last element to the root position.
- Percolate down:
  - While the current node has at least one child:
    - Compare with both children (if they exist).
  - If the current node is larger (for min heap) or smaller (for max heap) than any child:
    - Swap with the smaller (for min heap) or larger (for max heap) child.
    - Update the current node index to the swapped child index.

### Heapify Operation

- Add a dummy element (0) to the end of the array.
- Set the heap list to the given array.
- Set the current index to the parent of the last leaf node.
- While the current index is greater than 0:
  - Set i to the current index.
  - While `2 * i < size` of the heap:
    - If the right child exists and is smaller (for min-heap) or larger (for max-heap) than the left child:
      - Swap parent with the right child.
      - Update i to the index of the right child.
    - If the left child is smaller (for min-heap) or larger (for max-heap) than the parent:
      - Swap parent with the left child.
      - Update i to the index of the left child.
    - Otherwise, break the loop.
  - Decrement the current index.
- End of loop.

