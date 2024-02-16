class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        // Find the maximum score
        int maxScore = Integer.MIN_VALUE;
        for (int s : score) {
            maxScore = Math.max(maxScore, s);
        }

        // Create an array to store ranks
        int[] ranks = new int[maxScore + 1];

        // Assign ranks based on scores
        for (int i = 0; i < n; i++) {
            ranks[score[i]] = i + 1;
        }

        // Create the result array
        String[] result = new String[n];
        int currentRank = 1;

        for (int i = maxScore; i >= 0; i--) {
            if (ranks[i] != 0) {
                result[ranks[i] - 1] = getRankString(currentRank++);
            }
        }

              return result;
    }

    // Helper method to get the rank string
    private String getRankString(int rank) {
        if (rank == 1) {
            return "Gold Medal";
        } else if (rank == 2) {
            return "Silver Medal";
        } else if (rank == 3) {
            return "Bronze Medal";
        } else {
            return String.valueOf(rank);
        }
    }
}