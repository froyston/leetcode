class Solution {
    public int majorityElement(int[] nums) {
        int maxEle = 0, maxKey = 0;
        HashMap<Integer, Integer> elements = new HashMap<>();
        for(int num : nums) {
            elements.put(num , (elements.getOrDefault(num, 0) + 1));
        }
        for (Map.Entry<Integer, Integer> entries : elements.entrySet()) {
            if (entries.getValue() > maxEle) {
                maxEle = entries.getValue();
                maxKey = entries.getKey();
            }
        }
        return maxKey;
    }
}