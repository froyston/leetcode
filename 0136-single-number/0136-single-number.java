class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap <Integer, Integer> seen = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!seen.containsKey(nums[i])) {
                seen.put(nums[i] , 1);
            }
            else {
                seen.remove(nums[i]);
            }
        }
        return seen.keySet().iterator().next();
    }
}