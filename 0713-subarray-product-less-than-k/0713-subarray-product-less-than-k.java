class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int len = nums.length;
         
        for(int st = 0 ;st < len ;st++){
           int max = nums[st]; 
            if(max < k){
                count++;
            }
            for(int en = st+1;en<len;en++){
                max=max*nums[en];
                if(max < k){
                    count++;
                }
                if(max > k){
                    break;
                }
            }
        }
        return count;
    }
}