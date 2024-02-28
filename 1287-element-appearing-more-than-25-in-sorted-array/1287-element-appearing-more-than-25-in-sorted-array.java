class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = 1;
        int maxCount = arr.length / 4;
        
        for (int i = 0; i < arr.length - maxCount; i++) {
            
            if (arr[i] == arr[i + maxCount]) {
                return arr[i];
            }
        }
        return 0;
    }
}