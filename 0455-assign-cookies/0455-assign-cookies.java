class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int cookieIdx = 0, children = 0;
        
        while (cookieIdx < s.length && children < g.length) {
            if (s[cookieIdx] >= g[children]) {
                children++;
            }
            cookieIdx++;
        }
        return children;
    }
}