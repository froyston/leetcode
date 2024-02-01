class Solution {
    public int searchInsert(int[] nums, int target) {
        int centre;
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            centre = left + (right - left) / 2;
            if (nums[centre] == target) {
                return centre;
            }
            else if (nums[centre] > target) {
                right = centre - 1;
            }
            else {
                left = centre + 1;
            }
        }
        return left;
    }
}