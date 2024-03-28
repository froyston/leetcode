class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map <Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0, currFreq = 0;
        
        for (int num : nums) {
            freq.put(num , freq.getOrDefault(num , 0) + 1);
        
            int frequency = freq.get(num);
            if (frequency > maxFreq) {
                currFreq = frequency;
                maxFreq = frequency;
                
            } else if (frequency == maxFreq) {
                currFreq += frequency;            }
        }
        return currFreq;
    }
}