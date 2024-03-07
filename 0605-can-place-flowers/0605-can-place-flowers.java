class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            if (n == 0) {
                return true;
            }
            
            if(flowerbed[i] == 1) {
                i++;
            } else if (flowerbed[i] == 0 && i == len - 1) {
                i++;
                n--;
            } else if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                i++;
                n--;
            }
        }
        return (n == 0);
    }
}