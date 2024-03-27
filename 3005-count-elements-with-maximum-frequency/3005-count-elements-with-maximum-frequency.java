class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map <Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = Integer.MIN_VALUE;
        for (int num : freq.values()) {
            maxFreq = Math.max(maxFreq, num);
        }
        
        int countNums = 0;
        for (int num : freq.keySet()) {
            if (freq.get(num) == maxFreq) {
                countNums += 1;
            }
        }
        
        return countNums * maxFreq;
    }
}