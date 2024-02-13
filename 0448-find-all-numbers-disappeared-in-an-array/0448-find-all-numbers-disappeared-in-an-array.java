class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        int range = nums.length, curr = 1;
        while (curr <= range) {
            if (!set.contains(curr)) {
                result.add(curr);
            }
            curr++;
        }
        return result;
    }
}