class Solution {
    private int bs(int []nums,int left,int right,int t){
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==t){
                return mid;
            }
            else if(nums[mid]>t){
                right=mid-1;
            }
            else 
                left=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
      int left=0;
      int right=nums.length-1;
      int minindex=-1;
      while(left<=right){
        int mid=(left+right)/2;
        if(nums[mid]>nums[nums.length-1]){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
      }
      minindex=left;
      int result=bs(nums,0,minindex,target);  
      if(result!=-1){
        return result;
      }
      return bs(nums,minindex,nums.length-1,target); 
    }
}