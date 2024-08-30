class Solution {
    public int maximumCount(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int max=0;
        if(nums[left]==0 && nums[right]==0){
            return 0;
        }
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<0){
                max=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        max=max+1;
        int left1=0;
        int right1=nums.length-1;
        int max1=0;
        while(left1<=right1){
            int mid=(left1+right1)/2;
            if(nums[mid]>0){
                max1= nums.length - mid;
                right1=mid-1;
            }
            else{
                left1=mid+1;

            }
        }
         
        return Math.max(max,max1);
    }

}