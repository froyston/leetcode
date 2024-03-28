class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length - 1, col = matrix[0].length - 1;
        for (int r = row; r >= 0; r--) {
            for (int c = col; c >=0; c--) {
                if (r > 0 && c > 0 && matrix[r-1][c-1] != matrix[r][c])
                    return false;
            }
        }
        return true;
    }
}