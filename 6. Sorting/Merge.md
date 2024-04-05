## Merge Sort

1. **Check if the range indices of elements to be sorted contain more than one element**
2. **If yes, find the middle point index of the range**
3. **Sort the left half of the range indices by calling mergeSort recursively for the left half**
4. **Sort the right half of the range indices by calling mergeSort recursively for the right half**
5. **Merge the sorted left and right halves together**

### Merge Operation:

1. **Given the original array and the indices indicating the subarrays to merge**
2. **Calculate the lengths of the two subarrays**
3. **Create temporary arrays to store the sorted left and right halves**
4. **Copy the elements of the left and right halves of the array into temporary arrays**
5. **Initialize pointers for the left and right halves and an index for the merged array**
6. **Merge the two sorted halves by comparing elements and copying them into the original array**
7. **If there are remaining elements in either the left or right temporary array, copy them into the original array**


