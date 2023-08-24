class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> intersection = new ArrayList<>();
        for(int num : nums1) {
            seen.add(num);
        }
        
        for(int num : nums2) {
            if(seen.contains(num)) {
                intersection.add(num);
                seen.remove(num);
            } 
        }
        
        int[] result = new int[intersection.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = intersection.get(i);
        }
        
        return result;
    }
}