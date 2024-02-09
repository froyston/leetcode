class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int startNum = nums[i];
            
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            
            if (startNum != nums[i]) {
                ranges.add(startNum + "->" + nums[i]);
            }
            else {
                ranges.add(String.valueOf(nums[i]));
            }
        }
        return ranges;
    }
}