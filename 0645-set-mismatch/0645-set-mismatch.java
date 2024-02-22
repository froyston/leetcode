class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] errorNums = new int[2];
        for (int num : nums) {
            int newIdx = Math.abs(num) - 1;
            if (nums[newIdx] > 0) {
                nums[newIdx] *= -1;
            } else {
                errorNums[0] = newIdx + 1;
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                errorNums[1] = i + 1;
            }
        }
        return errorNums;
    }
}