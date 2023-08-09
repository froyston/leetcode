class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        for(int i = 0; i <= haystackLen - needleLen; i++) {
            int j = 0;
            if(haystack.charAt(i) == needle.charAt(j)) {
                int idx = i;
                while(j < needleLen) {      
                    if(haystack.charAt(i) != needle.charAt(j)) {
                        break;
                    }
                    i += 1;
                    j += 1;
                }
                if( j == needleLen) {
                    return idx;
                }
                i = idx;
            }
        }
        return -1;
    }
}