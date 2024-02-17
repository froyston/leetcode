class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int column = mat[0].length;
        if (row * column != r * c) {
            return mat;
        }
        else if (row == r && column == c) {
            return mat;
        }

        int cIndex = 0, rIndex = 0;
        int[][] newMatrix = new int[r][c];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                newMatrix[rIndex][cIndex] = mat[i][j];
                cIndex++;
                if (cIndex == c) {
                    rIndex++;
                    cIndex = 0;
                }
            }
        }
        return newMatrix;
    }
}