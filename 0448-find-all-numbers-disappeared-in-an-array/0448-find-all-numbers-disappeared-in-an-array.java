class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Set<Integer> seen = new HashSet<>();
        List<Integer> missing = new ArrayList<>();
        for(int num: nums) {
            seen.add(num);
        }
        
        for(int i = 1; i<= nums.length; i++) {
            if(!seen.contains(i)) {
                missing.add(i);
            }
        }
        return missing;
    }
}