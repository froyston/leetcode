class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                count += duration;
            }
            else {
                if (timeSeries[i] + duration - 1 < timeSeries[i + 1]) {
                    count += duration;
                }
                else {
                    count += (timeSeries[i + 1] - timeSeries[i]);
                }
            }
        }
        return count;
    }
}