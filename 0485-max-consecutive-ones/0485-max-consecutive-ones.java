class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnes = 0, currOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                currOnes += 1;
            }
            else {
                consecutiveOnes = Math.max(consecutiveOnes, currOnes);
                currOnes = 0;
            }
        }
        return Math.max(consecutiveOnes, currOnes);
    }
}