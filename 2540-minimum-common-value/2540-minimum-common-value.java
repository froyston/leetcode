class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        
        int idx1 = 0, idx2 = 0;
        
        while (idx1 < len1 && idx2 < len2) {
            if (nums1[idx1] > nums2[idx2]) {
                idx2++;
            } else if (nums1[idx1] < nums2[idx2]) {
                idx1++;
            } else {
                return nums1[idx1];
            }
        }
        return -1;
    }
}