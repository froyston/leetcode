class Solution {
    public int maxProductDifference(int[] nums) {
        int biggest = 0, secondBiggest = 0, smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        
        for (int num : nums) {
            
            if (num > biggest) {
                secondBiggest = biggest;
                biggest = num;
            } else if (num > secondBiggest) {
                secondBiggest = num;
            }
            
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
        }
        
        return (biggest * secondBiggest) - (smallest *  secondSmallest);
    }
}