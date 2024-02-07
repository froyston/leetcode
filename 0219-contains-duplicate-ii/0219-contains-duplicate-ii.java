class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> elements = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (elements.containsKey(nums[i])) {
                int idx = elements.get(nums[i]);
                if (Math.abs(idx - i) <= k) {
                    return true;
                }
            }
            elements.put(nums[i], i);
        }
        return false;
    }
}