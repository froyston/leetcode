class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        
        for (int num : nums) {
            if(firstMax == num || secondMax == num || thirdMax == num) {
                continue;
            }
            
            if(num >= firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }
            else if (num >= secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            }
            else if (num >= thirdMax) {
                thirdMax = num;
            }
        }
        
        if(thirdMax == Long.MIN_VALUE) {
            return (int) firstMax;
        }
        return (int) thirdMax;
    }
}