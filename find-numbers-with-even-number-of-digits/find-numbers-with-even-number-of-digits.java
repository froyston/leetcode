class Solution {
    public int findNumbers(int[] nums) {
        int tn = 0;
        for(int n : nums) {
            int count = 0;
            while (n > 0) {
                n = n /10;
                count += 1;
            }
            if (count % 2 == 0) {
                tn += 1;
            }
        }
        return tn;  
    }
}