## Merge Sort

-> Check if the range indices of elements to be sorted contains more than one element
-> If yes, find the middle point index of the range
-> Sort the left half of the range indices by calling mergeSort recursively for the left half
-> Sort the right half of the range indices by calling mergeSort recursively for the right half
-> Merge the sorted left and right halves together

-> Given the original array and the indices indicating the subarrays to merge
-> Calculate the lengths of the two subarrays
-> Create temporary arrays to store the sorted left and right halves
-> Copy the elements of the left and right halves of the array into temporary arrays
-> Initialize pointers for the left and right halves and an index for the merged array
-> Merge the two sorted halves by comparing elements and copying them into the original array
-> If there are remaining elements in either the left or right temporary array, copy them into the original array

