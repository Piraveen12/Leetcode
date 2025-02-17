class Solution {
    public int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE;
        int len = nums.length;
        int current=0;
        for(int i =0;i<len ;i++){
             current+=nums[i];
             if(current> max){
                max= current;
             }
             if(current<0){
                current =0;
             }
        }
        return max;
    }
}