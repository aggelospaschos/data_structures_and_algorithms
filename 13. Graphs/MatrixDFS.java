import java.util.List;
import java.util.Set;
import java.lang.Math;

public class MatrixDFS {
    // Count paths (backtracking)
    
    int dfs(int[][] grid, int rows, int cols, int[][] visit) {
    
        int ROWS = grid.length, COLS = grid[0].length;

        if (Math.min(rows, cols) < 0 || rows == ROWS || cols == COLS ||
            visit[rows][cols] == 1 || grid[rows][cols] == 1 ) {
            
            return 0;
        }
        if (rows == ROWS - 1 && cols == COLS - 1) {
        
            return 1;
        }
        visit[rows][cols] = 1;

        int count = 0;
        count += dfs(grid, rows + 1, cols, visit);
        count += dfs(grid, rows - 1, cols, visit);
        count += dfs(grid, rows, cols + 1, visit);
        count += dfs(grid, rows, cols - 1, visit);

        visit[rows][cols] = 0;
        return count;
    }
}