class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> numbers = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            numbers.put(nums1[i], nums1[i]);
        }
        
        for(int j = 0; j < nums2.length; j++) {
            if(numbers.containsKey(nums2[j])) {
                result.add(nums2[j]);
                numbers.remove(nums2[j]);
            }
        }
        int[] res = new int[result.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}