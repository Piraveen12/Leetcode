class Solution {
    public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    for(int val : nums){
        System.out.println(val);
    }
    int len = nums.length;
    if(len ==0){
        return 0;
    }
    int max = 1;
        int currentStreak = 1;
    for(int i=1;i<len;i++){
         if (nums[i] == nums[i - 1]) {
                continue; 
            } else if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } else {
                max = Math.max(max, currentStreak);
                currentStreak = 1;
            }
    }   
    return Math.max(max, currentStreak);
    }
}