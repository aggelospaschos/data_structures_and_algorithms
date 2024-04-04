## BST Operations

### Base Case
If the root is null, return false, indicating that the target is not found

### Search Process
1. Compare the target with the value of the current node
2. If the target is greater than the current node's value, recursively search in the right subtree
3. If the target is less than the current node's value, recursively search in the left subtree
4. If the target is equal to the current node's value, return true, indicating that the target is found

Consider the following BST:
        8
       / \
      3   10
     / \    \
    1   6    14
       / \   /
      4   7 13

Let's search for the target value 6:
1. Start at the root (value = 8)
2. Compare target (6) with root value (8). Since 6 is less than 8, move to the left subtree
3. Compare target (6) with current node value (3). Since 6 is greater than 3, move to the right subtree
4. Compare target (6) with current node value (6). Found! Return true
5. Search terminates, and the target is found in the tree

## Insert Operation

### Base Case
If the root is null, create a new node with the given value and return it as the new root

### Insertion Process
1. Compare the value to be inserted with the value of the current node
2. If the value is greater than the current node's value, recursively insert it into the right subtree
3. If the value is less than the current node's value, recursively insert it into the left subtree
4. Return the root of the modified tree

## Removal Operation

### Base Case
If the root is null, return null, indicating that the tree is empty

### Search and Remove Proces
1. Search for the node to be removed recursively
2. If the node is found:
		a. If the node has no children, simply remove it by returning null
		b. If the node has only one child, return the child to replace the removed node
		c. If the node has two children:
			i. Find the minimum value node in the right subtree (successor)
			ii. Copy the value of the successor node to the current node
			iii. Remove the successor node from its original position
3. Return the root of the modified tree