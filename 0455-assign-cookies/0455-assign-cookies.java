class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int happyChildren = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIdx = 0;
        while (cookieIdx < s.length && happyChildren < g.length) {
            if (s[cookieIdx] >= g[happyChildren]) {
                happyChildren++;
            }
            cookieIdx++;
        }
        return happyChildren;
    }
}