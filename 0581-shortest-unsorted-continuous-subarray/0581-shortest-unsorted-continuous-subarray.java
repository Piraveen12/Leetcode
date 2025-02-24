class Solution {
    public int findUnsortedSubarray(int[] nums) {
     int n = nums.length;
        int left = -1, right = -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                min = Math.min(min, nums[i]);  
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                max = Math.max(max, nums[i]); 
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > min) {
                left = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < max) {
                right = i;
                break;
            }
        }

        if (left == -1 || right == -1) {
            return 0;
        }

        return right - left + 1;
    }
}