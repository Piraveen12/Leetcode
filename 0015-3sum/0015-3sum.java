class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        int n=nums.length-1;
        List<List<Integer>>result=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
           int left=i+1;
           int right=n;
           while(left<right){
            int sum=nums[left]+nums[right]+nums[i];
            if(sum==0){
                List<Integer>ans =new ArrayList<>();
                ans.add(nums[i]);
                ans.add(nums[left]);
                ans.add(nums[right]);
                result.add(new ArrayList(ans));
                left++;
                right--;
                while(left<right && nums[left]==nums[left-1] ){
                 left++;
                }
                while(left<right && nums[right]==nums[right+1]){
                    right--;
                }
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
           }
        } 
        return result;
    }
}