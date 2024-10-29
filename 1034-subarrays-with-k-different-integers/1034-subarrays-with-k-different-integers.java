class Solution {
    public int ans(int [] nums,int k){
        if(k<0){
            return 0;
        }
        HashMap<Integer,Integer>arr=new HashMap<>();
        int l=0;
        int r=0;
        int n=nums.length;
        int ans=0;
        while(r<n){
            arr.put(nums[r],arr.getOrDefault(nums[r],0)+1);
             while(arr.size()>k){
              arr.put(nums[l], arr.get(nums[l]) - 1);
                if(arr.get(nums[l])==0){
                    arr.remove(nums[l]);
                }
                l++;
            }
            if(arr.size()<=k){
                ans+=r-l+1;
            }
           
            r++;
        }   
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int result1=ans(nums,k);
        int result2=ans(nums,k-1);
        return result1-result2;

    }
}