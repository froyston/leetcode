class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> greaterEle = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];
        for(int i = nums2.length - 1; i >= 0; i--) {
            int res = -1;
            while (!stack.isEmpty()) {
                int currNum = stack.peek();
                if (currNum > nums2[i]) {
                    res = currNum;
                    break;
                }
                else {
                    stack.pop();
                }
            }
            stack.push(nums2[i]);
            greaterEle.put(nums2[i], res);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            result[i] = greaterEle.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}