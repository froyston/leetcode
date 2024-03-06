class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> difference = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (difference.containsKey(target - nums[i])) {
                ans[0] = difference.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            difference.put(nums[i], i);
        }
        return ans;
    }
}