import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] array, int start, int end) {
    
        if (end - start + 1 <= 1) {
            return array;
        }

        int pivot = array[end];
        int left = start;       // pointer for left side

        // Partition: elements smaller than pivot on left side
        for (int i = start; i < end; i++) {
        
            if (array[i] < pivot) {
            
                int temporary = array[left];
                array[left] = array[i];
                array[i] = temporary;
                left++;
            }
        }

        // Move pivot in-between left & right sides
        array[end] = array[left];
        array[left] = pivot;

        // Quick sort left side
        quickSort(array, start, left - 1);

        // Quick sort right side
        quickSort(array, left + 1, end);

        return array;
    }
}