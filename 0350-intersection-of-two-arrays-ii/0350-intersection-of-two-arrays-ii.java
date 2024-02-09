class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int idx = 0;
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        
        Map<Integer,Integer> commonElements = new HashMap<>();
        for(int num : nums1) {
            commonElements.put(num, commonElements.getOrDefault(num, 0) + 1);
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if(commonElements.containsKey(nums2[i]) && commonElements.get(nums2[i]) > 0) {
                nums1[idx++] = nums2[i];
                commonElements.put(nums2[i], commonElements.get(nums2[i]) - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, idx);
    }
}