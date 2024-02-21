class Solution {
    public int islandPerimeter(int[][] grid) {
        int up = 0, left = 0;
        int perimeter = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    
                    up = (i == 0) ? 0 : grid[i - 1][j];
                    left = (j ==0) ? 0 : grid[i][j - 1];
                    
                    perimeter = perimeter + 4 - (2* up) - (2* left);
                }
            }
        }
        return perimeter;
    }
}