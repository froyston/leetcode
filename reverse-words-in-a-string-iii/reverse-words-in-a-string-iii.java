class Solution {
    public String reverseWords(String s) {
        int start = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length() + 1; i++) {
            if(i == s.length() || c[i] == ' ') {
                reverse(c, start, i-1);
                start = i + 1;
            }
        }
        return new String(c);
    }
    
    public void reverse(char[] c, int start, int end) {
        while(start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start ++;
            end --;
        }
    }
}