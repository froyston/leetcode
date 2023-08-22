class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        
        int word1Ptr = Integer.MIN_VALUE, word2Ptr = Integer.MIN_VALUE;
        int diff = Integer.MAX_VALUE;
        boolean changed1 = false, changed2 = false;
        
        for(int i = 0; i < wordsDict.length; i++) {
            if (word1.equals(wordsDict[i])) {
                word1Ptr = i;
                changed1 = true;
            }
            else if (word2.equals(wordsDict[i])) {
                word2Ptr = i;
                changed2 = true;
            }
            
            if (changed1 && changed2) {
                diff = Math.min(diff, Math.abs( word1Ptr - word2Ptr));
            }
        }
        
        return diff;
    }
}