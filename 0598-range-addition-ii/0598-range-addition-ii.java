class Solution {
    public int maxCount(int m, int n, int[][] ops) {
       for (int[] row : ops) {
           m = Math.min(m, row[0]);
           n = Math.min(n, row[1]);
       }
        return m*n;
    }
}