class Solution {
    public int distributeCandies(int[] candyType) {
        int len = candyType.length;
        Set<Integer> candyT = new HashSet<>();
        for (int candy : candyType) {
            candyT.add(candy);
            if(candyT.size() == len / 2) {
                return candyT.size();
            }
        }
        return Math.min(candyT.size(), len / 2);
    }
}