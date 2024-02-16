class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> position = new HashMap<>();
        int s = score.length;
        
        for (int i = 0; i < s; i++) {
            position.put(score[i], i);
        }
        
        Arrays.sort(score);
        String[] result = new String[s];
        int rank = 1;
        
        for (int i = s - 1; i >= 0; i--) {
            if (rank == 1) {
                result[position.get(score[i])] = "Gold Medal";
                rank ++;
            }
            else if (rank == 2) {
                result[position.get(score[i])] = "Silver Medal";
                rank ++;
            }
            else if (rank == 3) {
                result[position.get(score[i])] = "Bronze Medal";
                rank ++;
            }
            else {
                result[position.get(score[i])] = "" + rank;
                rank ++;
            }
        }
        return result;
    }
}