class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, tot_sum = 0;
        
        for(int num: nums) {
            if(num == 0) {
                tot_sum = Math.max(tot_sum, sum);
                sum = 0;
            }
            else {
                sum += 1;
            }
        }
        return Math.max(tot_sum, sum);
    }
}