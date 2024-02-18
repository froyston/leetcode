class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }
        Map<String, Integer> strings = new HashMap<>();
        
        List<String> common = new ArrayList<>();
        
        int j = 0;
        for (String restaurant : list1) {
            strings.put(restaurant, j++);
        }
        int minIdx = Integer.MAX_VALUE;
        int currIdx = 0;
        for (int i = 0; i < list2.length; i++) {
            if (strings.containsKey(list2[i])) {
                currIdx = strings.get(list2[i]) + i;
                if (currIdx < minIdx) {
                    common.clear();
                    minIdx = currIdx;
                }
                if (minIdx == currIdx) {
                    common.add(list2[i]);
                }
            }
        }
        
        String[] res = new String[common.size()];
        int idx = 0;
        for (String str : common) {
            res[idx] = common.get(idx);
            idx++;
        }
        return res;
    }
}