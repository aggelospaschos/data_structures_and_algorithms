## What are Heaps?

Heaps are a complete binary tree data structure that implements priority queues. In heaps, every node has a child less than or equal to its value (max heap) or greater than or equal to its value (min heap).

### Initialization

Create an empty list to represent the heap. The first element is initialized as 0 for easier indexing.

### Push (Insertion)

1. Append the new value to the end of the list.
2. Get the index of the new element.
3. Percolate up:
    a. While the current element is smaller than its parent and not at the root:
        i. Swap the current element with its parent.
        ii. Update the index to the parent's index.

### Pop (Removal)

1. Check if the heap has only one element. If yes, return that element.
2. Otherwise, remove the root element (the minimum or maximum value).
3. Move the last element to the root position.
4. Percolate down:
    a. While the current node has at least one child:
        i. Compare with both children (if they exist).
    b. If the current node is larger (for min heap) or smaller (for max heap) than any child:
        i. Swap with the smaller (for min heap) or larger (for max heap) child.
        ii. Update the current node index to the swapped child index.

### Heapify Operation

1. Add a dummy element (0) to the end of the array.
2. Set the heap list to the given array.
3. Set the current index to the parent of the last leaf node.
4. While the current index is greater than 0:
    a. Set i to the current index.
    b. While `2 * i < size` of the heap:
        i. If the right child exists and is smaller (for min-heap) or larger (for max-heap) than the left child:
            - Swap parent with the right child.
            - Update i to the index of the right child.
        ii. If the left child is smaller (for min-heap) or larger (for max-heap) than the parent:
            - Swap parent with the left child.
            - Update i to the index of the left child.
        iii. Otherwise, break the loop.
    iv. Decrement the current index.
5. End of loop.
