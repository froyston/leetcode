class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersect = new ArrayList<>();
        Map<Integer,Integer> seen = new HashMap<>();
        for(int num: nums1) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        
        for(int num: nums2) {
            int count = seen.getOrDefault(num , 0);
            if( count > 0) {
                intersect.add(num);
                seen.put(num, count - 1);
            }
        }
        
        int[] result = new int[intersect.size()];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = intersect.get(i);
        }
        
        return result;
    }
}