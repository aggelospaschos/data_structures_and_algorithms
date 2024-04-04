import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {
    
        for (int i = 1; i < array.length; i++) {
        
            int j = i - 1;
            while (j >= 0 && array[i] < array[j]) {
            
                int temporary = array[i];
                array[i] = array[j];
                array[j] = temporary;
                j--;
            }
        }
        return array;
    }
}