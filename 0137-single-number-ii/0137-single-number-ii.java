class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }
        for(int i =0;i< nums.length;i++){
            if(ans.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}