class Solution {
    public boolean validWordSquare(List<String> words) {
        int row = words.size();
        for(int i = 0; i < row; i++) {
            int d = 0;
            while (d < words.get(i).length()) {
                if( d >= row ||
                    i >= words.get(d).length() ||
                    words.get(i).charAt(d) != words.get(d).charAt(i)) {
                    return false;
                }
                d++;
            }
        }
        return true;
    }
}