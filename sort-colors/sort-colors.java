class Solution {
    public void sortColors(int[] nums) {
        
        for(int i = 1; i < nums.length; i++) {
            
            int curr_idx = i;
            
            while(curr_idx > 0 && nums[curr_idx] < nums[curr_idx - 1]) {
                int temp = nums[curr_idx];
                nums[curr_idx] = nums[curr_idx - 1];
                nums[curr_idx - 1] = temp;
                curr_idx -= 1;
            }
        }
    }   
}