class Solution {
    public boolean  jump(int st, Boolean [] arr , int [] nums ,int end){
        if(st >= end){
            return true;
        }
        if(nums[st]==0){
            return false;
        }
        if(arr[st]!=null){
            return  arr[st];
        }
      for (int  i = 1 ; i <= nums[st]; i++) {
            if (jump(st + i,arr, nums, end)) {
                arr[st]=true;
                return true;  
            }
        }
        arr[st]=false;
        return false;
        
    }
    public boolean canJump(int[] nums) {
        if(nums.length<=1){
            return true;
        }
        int st=0;
        int end=nums.length-1;
        Boolean [] arr = new Boolean[end+2];
        //Arrays.fill(arr,false);
       return jump(st,arr,nums,end);
    }
}