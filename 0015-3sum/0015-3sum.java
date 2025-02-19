class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        for(int i=0;i<len ;i++){
             if(i> 0 && nums[i]==nums[i-1]){
                    continue;
                 }
            int val = nums[i];
            int left = i+1;
            int right = len -1;
            while(left < right){
                int sum=val+nums[left]+nums[right];
                if( sum==0){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[left]);
                    ans.add(nums[right]);
                    result.add(ans);
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                    left++;
                }
               
               else  if(sum>0 ){
                    right--;
                }
                else{
                    left ++;
                }
            }
        }
        return result;
    }
}