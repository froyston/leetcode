class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = false, decreasing = false;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] > nums[i - 1]) {
                increasing = true;
            } else {
                decreasing = true;
            }
            
            if (increasing & decreasing) {
                return false;
            }
        }
        return true;
    }
}