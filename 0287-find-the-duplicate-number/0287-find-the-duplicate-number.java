class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer> ans = new HashMap<>();
       int result = 0;
       for(int val : nums){
        ans.put(val,ans.getOrDefault(val,0)+1);
        if(ans.get(val)> 1){
            result = val;
            break;
        }
       } 
       return result;
    }
}