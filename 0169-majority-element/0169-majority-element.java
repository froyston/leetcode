class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        for(int num: nums) {
            if(!seen.containsKey(num)) {
                seen.put(num, 1);
            }
            else {
                seen.put(num, seen.get(num) + 1);
            }
        }
        
        Map.Entry<Integer, Integer> majorityEle = null;
        
        for(Map.Entry<Integer, Integer> entries : seen.entrySet()) {
            if (majorityEle == null || entries.getValue() > majorityEle.getValue()) {
                majorityEle = entries;
            }
        }
        return majorityEle.getKey();
    }
}