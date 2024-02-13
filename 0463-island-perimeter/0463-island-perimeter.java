class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        
        int up, left;
        int perimeter = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4;
                    if (r > 0) {
                        perimeter = (grid[r - 1][c] == 1) ? perimeter -= 2 : perimeter;
                    }
                    if ( c > 0) {
                        perimeter = (grid[r][c - 1] == 1)? perimeter -= 2 : perimeter;
                    }
                }
            }
        }
        return perimeter;
    }
}