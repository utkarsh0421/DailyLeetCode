// 2257. Count Unguarded Cells in the Grid
// https://leetcode.com/problems/count-unguarded-cells-in-the-grid/

public class main {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        
        // Mark guards (1) and walls (2)
        for (int[] g : guards) grid[g[0]][g[1]] = 1;
        for (int[] w : walls) grid[w[0]][w[1]] = 2;
        
        // Directions: up, down, left, right
        int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        
        for (int[] g : guards) {
            int r = g[0], c = g[1];
            
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                
                while (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] != 1 && grid[nr][nc] != 2) {
                    // mark guarded cell if not guard/wall
                    if (grid[nr][nc] == 0) grid[nr][nc] = 3;
                    nr += d[0];
                    nc += d[1];
                }
            }
        }
        
        // Count unguarded (0)
        int unguarded = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) unguarded++;
            }
        }
        
        return unguarded;
    }
}
