class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) {
                return true;
            }
            if (flowerbed[i] == 1) {
                i += 1;
            } else if (flowerbed[i] == 0 && i == flowerbed.length -1) {
                n --;
                i += 1;
            } else if (flowerbed[i] == 0 && flowerbed[i + 1] == 0){
                n --;
                i += 1;
            }
        }
        return (n == 0);
    }
}