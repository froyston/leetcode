class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList();

        int diff = Integer.MAX_VALUE;

        for(int i = 1; i< arr.length; i++) {
            diff = Math.min(diff, arr[i] - arr[i-1]);
        }
        
        for(int i = 1; i<arr.length; i++) {
            
            if((arr[i] - arr[i - 1]) == diff) {
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
            
            
        }
        return result;
    }
    
    public void sort(int[] nums) {
        
        for(int i = 1; i < nums.length; i++) {
            int curr_idx = i;
            
            while(curr_idx > 0 && nums[curr_idx] < nums[curr_idx - 1]) {
                
                int temp = nums[curr_idx];
                nums[curr_idx] = nums[curr_idx - 1];
                nums[curr_idx - 1] = temp;
                curr_idx -= 1;   
            }
        }
    }
}