 class Solution {
    public int[] twoSum(int[] nums, int target) {

       HashMap<Integer,Integer> ans = new HashMap<>();
       
       for (int i=0;i<nums.length;i++){
         int com=target-nums[i];
         if(ans.containsKey(com)&& ans.get(com)!=i){
            return new int[]{i,ans.get(com)};
          }
          else
            ans.put(nums[i],i);
       } 
       return new int[]{-1,-1};
    }
}