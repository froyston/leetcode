class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] rowOnes = new int[row];
        int[] colOnes = new int[col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    rowOnes[i]++;
                    colOnes[j]++;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < row; i++) {
            if (rowOnes[i] == 1) {
                for (int j = 0; j < col; j++) {
                    if (colOnes[j] == 1 && mat[i][j] == 1) {
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}