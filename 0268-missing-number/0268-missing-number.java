class Solution {
    public int missingNumber(int[] nums) {
        int n = 1, result = 0;
        for (int i = 0; i <nums.length; i++) {
            result = result - nums[i] + n;
            n ++;
        }
        return result;
    }
}