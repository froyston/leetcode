class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newArray = new int[2*n];
        
        for(int i = 0; i < n; i++) {
            newArray[i] = nums[i];
            newArray[i + n] = nums[i];
        }
        return newArray;
    }
}