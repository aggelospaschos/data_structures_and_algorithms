
import java.util.Arrays;

public class MergeSort {
    
    public static int[] mergeSort(int[] array, int first, int last) { // array, starting index of array, last index of array
        if (first < last) {

            // Find the middle point of array
            int middle = (first + last) / 2;

            mergeSort(array, first, middle);   // sort left half
            mergeSort(array, middle+1, last); // sort right half
            merge(array, first, middle, last);    // merge sorted halfs
        }
        return array;
    } 

    // Merges two subarrays of array[].
    // First subarray is array[first..middle]
    // Second subarray is arr[middle+1..last]
    public static void merge(int[] array, int first, int middle, int last) { 
        
        // Find lengths of two subarrays to be merged
        int length1 = middle - first + 1;
        int length2 = last - middle;

        // Create temporary arrays 
        int Left[] = new int[length1];
        int Right[] = new int[length2];

        // Copy the sorted left & right halfs to temporary arrays
        for (int i = 0; i < length1; i++) {
        
            Left[i] = array[first + i];
        }
        
        for (int j = 0; j < length2; j++) {
        
            Right[j] = array[middle + 1 + j];
        }
        
        // initial indexes of left and right sub-arrays
        int i = 0; // index for left
        int j = 0; // index for right
        int k = first; // Initial index of merged subarray array

        // Merge the two sorted halfs into the original array
        while(i < length1 && j < length2) {
        
            if (Left[i] <= Right[j]) {
            
                array[k] = Left[i];
                i++;
            } else {
            
                array[k] = Right[j];
                j++;
            }
            k++;
        }
        // One of the halfs will have elements remaining

        // Copy remaining elements of L[] if any 
        while (i < length1) {
        
            array[k] = Left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any 
        while (j < length2) {
        
            array[k] = Right[j];
            j++;
            k++;
        }
    }
}