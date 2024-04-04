import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// leftChild = heap[2 * i]
// rightChild = heap[(2 * i) + 1] 
// parent = heap[i // 2]

public class Heapify {
    
    List<Integer> heap;

    public Heap() {
    
        heap = new ArrayList<Integer>();
        heap.add(0);
    }
    // ... not showing push, pop to save space.

    public void heapify(ArrayList<Integer> array) {
    
        // 0-th position is moved to the end
        array.add(array.get(0));

        heap = array;
        int current = (heap.size() - 1) / 2;
        while (current > 0) {
            // Percolate Down
            
            int i = current;
            while (2 * i < heap.size()) {
            
                if (2 + i + 1 < heap.size() &&
                heap.get(2 + i + 1) < heap.get(2 * i) &&
                heap.get(i) > heap.get(2 * i + 1)) {
                
                    // Swap right child
                    int temporary = heap.get(i);
                    heap.set(i, heap.get(2 * i + 1));
                    heap.set(2 * i + 1, temporary);
                    i = 2 * i + 1;
                } else if (heap.get(i) > heap.get(2 * i)) {
                
                    // Swap left child
                    int temporary = heap.get(i);
                    heap.set(i, heap.get(2 * i));
                    heap.set(2 * i, temporary);
                    i = 2 * i;
                } else {
                
                    break;
                }
            }
            current--;
        }
        return;
    }
}