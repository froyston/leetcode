class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int[] frequency = new int[26];
        for(char c : chars.toCharArray()) {
            frequency[c -'a']++;
        }
        int sumLen = 0;
        for (String word : words) {
            int[] wordFrequency = new int[26];
            boolean goodWord = true;
            for (char c : word.toCharArray()) {
                int currIdx = c - 'a';
                wordFrequency[currIdx]++;
                
                if (frequency[currIdx] < wordFrequency[currIdx]) {
                    goodWord = false;
                    break;
                }
            }
            if (goodWord) {
             sumLen += word.length();   
            }
        }
        return sumLen;
    }
}