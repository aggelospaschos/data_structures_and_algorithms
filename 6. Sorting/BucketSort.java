import java.util.Arrays;

public class BucketSort {

    public static int[] bucketSort(int[] array) {
    
        // Assuming array only contains 0, 1 or 2
        int[] counts = {0, 0, 0};

        // Count the quantity of each value in array
        for (int value: array) {
            counts[value] += 1;
        }

        // Fill each bucket in the original array
        int i = 0;
        for (int value = 0; value < counts.length; value++) {
        
            for (int j = 0; j < counts[value]; j++) {
            
                array[i] = value;
                i++;
            }
        }
        return array;
    }
}