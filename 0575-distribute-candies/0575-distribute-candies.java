class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candyT = new HashSet<>();
        for (int candy : candyType) {
            candyT.add(candy);
        }
        return Math.min(candyT.size(), candyType.length / 2);
    }
}