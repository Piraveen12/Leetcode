class Solution {
    public int findMin(int[] nums) {
        int st = 0;
        int end = nums.length-1;
        if(end==0){
            return nums[0];
        }
         
        while(st < end){
            int mid=(st+end)/2;
            if(nums[mid] > nums[end]){
                st=mid+1;
            }
            else{
                end=mid;
            }
        }
        return nums[st];
    }
}