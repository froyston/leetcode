class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurences = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            occurences.put(num, occurences.getOrDefault(num , 0) + 1);
        }
        
        for (int i : occurences.keySet()) {
            set.add(occurences.get(i));
        }
        
        if (set.size() == occurences.size()) {
            return true;
        }
        return false;
    }
}