class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (String word : words) {
            int[] row = new int[3];
            for (char c : word.toLowerCase().toCharArray()) {
                if (s1.indexOf(c) != -1) {
                    row[0] = 1;
                }
                else if (s2.indexOf(c) != -1) {
                    row[1] = 1;
                }
                else if (s3.indexOf(c) != -1) {
                    row[2] = 1;
                }
            }
            
            if (row[0] + row[1] + row[2] == 1) {
                list.add(word);
            }
        }
        String[] arr = new String[list.size()];
        int i=0;

        for(String word : list)
            arr[i++] = word;

            return arr;
    }
}