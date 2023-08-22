class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int prevIndex = 0;
        HashMap <Integer, Integer> seen = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!seen.containsKey(nums[i])) {
                seen.put(nums[i], i);
            }
            else {
               prevIndex = seen.get(nums[i]);
               if(Math.abs(prevIndex - i) <= k) {
                   return true;
               }
               seen.put(nums[i] , i);
            }
        }
        return false;
    }
}