class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> seen = new HashMap<>();
        
        for(int num: nums) {
            if(!seen.containsKey(num)) {
                seen.put(num, 1);
            }
            else {
                return true;
            }
        }
        return false;
    }
}