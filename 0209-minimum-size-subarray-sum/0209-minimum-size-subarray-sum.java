class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int count = Integer.MAX_VALUE;
        int sum = 0;
        while (r < n) {
        sum += nums[r];
        while (sum >= target) {
            count = Math.min(count, r - l + 1);
            sum -= nums[l];
            l++;
        }
    
        r++;
        }
    return count == Integer.MAX_VALUE ? 0 : count;
    }
}