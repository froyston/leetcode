class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        
        int up, down, left, right;
        int perimeter = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (grid[r][c] == 1) {
                    up = (r > 0) ? grid[r - 1][c] : 0;
                    left = (c > 0) ? grid[r][c - 1] : 0;
                    down = (r + 1 == rows) ? 0 : grid[r + 1][c];
                    right = (c + 1 == columns) ? 0 : grid[r][c + 1];
                    
                    perimeter = perimeter + (4 - up - down - left - right);
                }
            }
        }
        return perimeter;
    }
}