class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max_len = 0, curr_len = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                curr_len += 1;
            } else {
                max_len = Math.max(max_len, curr_len + 1);
                curr_len = 0;
            }
        }
        return Math.max(max_len, curr_len + 1);
    }
}