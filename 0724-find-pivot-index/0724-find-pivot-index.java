class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0, sumRight = 0;
        for (int num : nums) {
            sumRight += num;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (sumLeft == sumRight - sumLeft - nums[i]) {
                return i;
            }
            
            sumLeft += nums[i];
        }
        return -1;
    }
}