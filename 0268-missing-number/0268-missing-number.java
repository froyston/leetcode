class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int num = 0; num < nums.length; num++) {
           res = res ^ (num ^ nums[num]);
        }
        return res;
    }
}