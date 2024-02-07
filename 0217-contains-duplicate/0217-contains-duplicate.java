class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> elements = new HashMap<>();
        for (int num: nums) {
            if(elements.containsKey(num)) {
                return true;
            }
            else {
                elements.put(num, 1);
            }
        }
        return false;
    }
}