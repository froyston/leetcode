class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length - 1;
        int dups = 0;

        for(int i = 0; i <= len - dups; i++) {
            if (arr[i] == 0) {
                if (i == len - dups) {
                    arr[len] = 0;
                    len -=1;
                    break;
                }
                dups += 1;
            }
        }
        
        int new_len = len - dups;
        System.out.println(" " +len +dups +new_len);
        for(int copy_from = new_len; copy_from >=0 ; copy_from--) {
            if(arr[copy_from] == 0) {
                arr[copy_from + dups] = 0;
                dups--;
                arr[copy_from + dups] = 0;
            }
            else {
                arr[copy_from + dups] = arr[copy_from];
            }
        }
    }
}