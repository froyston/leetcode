class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(target - nums[i])) {
                res[0] = numbers.get(target - nums[i]);
                res[1] = i;
            }
            numbers.put(nums[i] , i);
        }
        return res;
    }
}