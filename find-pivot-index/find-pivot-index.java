class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0, rightSum = 0;
        
        for(int n:nums) {
            sum += n;
        }
        for(int i = 0; i < nums.length; i++) {
            rightSum = sum - nums[i] - leftSum; 
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}