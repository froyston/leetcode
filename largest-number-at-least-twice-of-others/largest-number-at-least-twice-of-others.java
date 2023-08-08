class Solution {
    public int dominantIndex(int[] nums) {
        int firstPointer = Integer.MIN_VALUE;
        int secondPointer = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
           if(nums[i] > firstPointer) {
               secondPointer = firstPointer;
                firstPointer = nums[i];
               index = i;
           }
            else if (nums[i] > secondPointer) {
                secondPointer = nums[i];
            }
        }
        
        return (firstPointer >= 2*secondPointer) ? index : -1;
    }
}