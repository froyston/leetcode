class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length , ptr = 0;
        for (int i = 1; i <= n; i++) {
            if (i == n || nums[i] - (long)nums[i - 1] > 1) {
                if (i - 1 == ptr) {
                    result.add("" + nums[ptr]);
                } else {
                    result.add(nums[ptr] + "->" + nums[i - 1]);
                }
                ptr = i;
            }
        }
        return result;
    }
}