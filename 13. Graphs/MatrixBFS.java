import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.lang.Math;

public class MatrixBFS {

    //Matrix (2D Grid)
    int[][] grid = {{0, 0, 0, 0},
                    {1, 1, 0, 0},
                    {0, 0, 0, 1},
                    {0, 1, 0, 0}};

    // Shortest path from top left to bottom right
    public int bfs(int[][] grid) {
    
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int[][] visit = new int[4][4];
        Deque<int[]> queue = new ArrayDeque<>();

        queue.add(new int[2]); // Add {0, 0}
        visit[0][0] = 1;

        int length = 0;
        while (!queue.isEmpty()) {
        
            int queueLength = queue.size();
            for (int i = 0; i < queueLength; i++) {
            
                int pair[] = queue.poll();
                int rows = pair[0], cols = pair[1];
                if (rows == ROWS - 1 && cols == COLS - 1) {
                
                    return length;
                }    
                // We can directly build the four neighbors
                int[][] neighbors = {{rows, cols + 1}, {rows, cols - 1}, {rows + 1, cols}, {rows - 1, cols}};
                for (int j = 0; j < 4; j++) {
                
                    int newRow = neighbors[j][0], newCol = neighbors[j][1];
                    if (Math.min(newRow, newCol) < 0 || newRow == ROWS || newCol == COLS
                    || visit[newRow][newCol] == 1 || grid[newRow][newCol] == 1) {
                    
                        continue;
                    }
                    queue.add(neighbors[j]);
                    visit[newRow][newCol] = 1;
                }
            }
            length++;
        }
        return length; // This should never be called
    }
}