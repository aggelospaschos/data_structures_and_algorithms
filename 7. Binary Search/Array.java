public class Array {

    public static int binarySearch(int[] array,  int target) {
    
        int Low = 0, High = array.length - 1;
        int mid;

        while (Low <= High) {
        
            mid = (Low + High) / 2;
            if (target > array[mid]) {
            
                Low = mid + 1;
            } else if (target < array[mid]) {
            
                High = mid - 1;
            } else {
            
                return mid;
            }
        }
        return - 1;
    }
}