class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[2 * n];
        int xPtr = 0, yPtr = n;
        for (int i = 0; i < 2 * n; i += 2) {
            shuffledArray[i] = nums[xPtr];
            shuffledArray[i + 1] = nums[yPtr];
            xPtr++;
            yPtr++;
        }
        return shuffledArray;
    }
}