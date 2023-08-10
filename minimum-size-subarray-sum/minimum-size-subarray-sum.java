class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int output = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while(sum >= target) {
                output = Math.min(output, i - left + 1);
                sum -= nums[left];
                left += 1;
            }
        }
        if(output != Integer.MAX_VALUE) {
            return output;
        }
        else {
            return 0;
        }
    }
}