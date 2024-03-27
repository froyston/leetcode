class Solution {
    public int maxProduct(int[] nums) {
        
        if (nums.length == 2) {
            return (nums[0] - 1) * (nums[1] - 1);
        }
        
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}