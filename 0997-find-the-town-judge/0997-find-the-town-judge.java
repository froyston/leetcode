class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustScore = new int [n + 1];
        
        for (int i = 0; i < trust.length; i++) {
            trustScore[trust[i][0]]--;
            trustScore[trust[i][1]]++;
        }
        
        for (int j = 1; j <= n; j++) {
            if (trustScore[j] == n - 1) {
                return j;
            }
        }
        return -1;
    }
}