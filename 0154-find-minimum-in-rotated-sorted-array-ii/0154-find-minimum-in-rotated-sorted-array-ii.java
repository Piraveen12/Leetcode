class Solution {
    public int findMin(int[] nums) {
        
        int end=nums.length-1;
        if(nums.length== 1){
            return nums[0];
        }
        int min=Integer.MAX_VALUE;
        for(int st = 0; st <= end ; st++){
            min=Math.min(min,nums[st]);
        }
        return min;
    }
}