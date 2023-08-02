class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedHeight = Arrays.copyOf(heights, heights.length);
        int count = 0;
        bubbleSort(sortedHeight);
        
        for(int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeight[i]) {
                count += 1;
            }
        }
        return count;
    }
    public void bubbleSort(int[] sortedHeight) {
        
        boolean hasSwap = true;
        
        while(hasSwap) {
            hasSwap = false;
            for(int i = 0; i < sortedHeight.length - 1; i++) {
                if(sortedHeight[i] > sortedHeight[i + 1]) {
                    int temp = sortedHeight[i];
                    sortedHeight[i] = sortedHeight[i + 1];
                    sortedHeight[i + 1] = temp;
                    hasSwap = true;
                }
            }
        }
    }
}