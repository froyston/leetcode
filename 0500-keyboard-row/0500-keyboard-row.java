class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List <String> result = new ArrayList<>();
        
        for (String word : words) {
            int r1 = 0, r2 = 0, r3 = 0;
            for (char c : word.toLowerCase().toCharArray()) {
                if (row1.indexOf(c) != -1) {
                    r1 = 1;
                }
                else if (row2.indexOf(c) != -1) {
                    r2 = 1;
                }
                else if (row3.indexOf(c) != -1) {
                    r3 = 1;
                }
            }
            if (r1 + r2 + r3 == 1) {
                result.add(word);
            }
        }
        int i = 0;
        String [] res = new String[result.size()];
        for (String word : result) {
            res[i++] = word;
        }
        return res;
    }
}