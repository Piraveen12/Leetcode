class Solution {
    public int ans(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int l=0;
        int r=0;
        int n=nums.length;
        int count=0;
        int sum=0;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result1=ans(nums,goal);
        int result2=ans(nums,goal-1);
        return result1-result2;
    }
}