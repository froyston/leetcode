class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        
        for(int num : nums) {
            numbers.add(num);
        }
        
        if (numbers.contains(0)) {
            return numbers.size() - 1;
        } else {
            return numbers.size();
        }
    }
}