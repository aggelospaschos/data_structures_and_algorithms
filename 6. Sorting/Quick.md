## Quick Sort

### Partitioning

1. **Choose an element from the array as the pivot**
2. **Rearrange the array such that all elements smaller than the pivot are moved to its left, and all elements greater than the pivot are moved to its right**
3. **Place the pivot in its correct sorted position within the array**

### Recursive Calls

- **Recursively apply Quick Sort to the subarrays to the left and right of the pivot, excluding the pivot itself**
- **Continue this process until each subarray contains only one element, indicating that the entire array is sorted**

### Example:

Consider the array `[10, 80, 30, 90, 40]`:

1. We choose a pivot, for example, let's choose the last element (`40`) as the pivot
2. After partitioning: `[10, 30, 40, 90, 80]`. The pivot (`40`) is now in its correct sorted position
3. Apply Quick Sort recursively to the left and right subarrays:
   - Left subarray: `[10, 30]`
   - Right subarray: `[90, 80]`
4. Apply Quick Sort again on these subarrays will eventually lead to a sorted array
