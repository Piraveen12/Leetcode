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
            sum+=nums[r]%2;
            while(sum>goal){
                sum=sum-nums[l]%2;
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int result1=ans(nums,k);
        int result2=ans(nums,k-1);
        return result1-result2;
    }
}