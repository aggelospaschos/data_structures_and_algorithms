## Insertion Sort

To sort an array using Insertion Sort:

1. Iterate over the array starting from the second element (index 1) to the end
2. For each element at index i:
   a. Initialize a variable j to `i - 1` 
   b. While j is greater than or equal to 0 and the element at index i is less than the element at index j:
      - Swap the elements at indexes i and j
      - Decrement j by 1
3. Repeat steps 2 to 3 until the entire array is sorted

Consider an array `[12, 11, 13, 5, 6]`:

1. Start iterating over the array from index 1
2. For each element at index i:
   a. Compare it with the elements to its left
   b. If it's smaller, swap it with the elements to its left until it's in the correct position
   c. Continue this process until the entire array is sorted