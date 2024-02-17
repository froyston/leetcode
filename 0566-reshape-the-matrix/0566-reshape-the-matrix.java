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
        
        List<Integer> contents = new ArrayList<>();
        for (int[] r1 : mat) {
            for (int c1 : r1) {
                contents.add(c1);
            }
        }
        int k = 0;
        int[][] newMatrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newMatrix[i][j] = contents.get(k++);
            }
        }
        return newMatrix;
    }
}