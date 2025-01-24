class Solution {
    public int removeDuplicates(int[] nums) {
      int length = nums.length;
      int j =1 ;
      for(int st = 1; st < length ;st++){
        if(nums[st] != nums[st-1]){
            nums[j] = nums[st];
            j++;
        }

      }
      return j;
    }
}