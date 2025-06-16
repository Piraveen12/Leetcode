class Solution {
    public boolean check(int[] nums, int count, int len,Boolean [] result) {
        if (count >= len - 1) {
            return true;
        }
        if (nums[count] == 0) {
            return false;
        }
        if(result[count] != null){
            return result[count];
        }
        for (int i = 1; i <= nums[count]; i++) {
            if (check(nums, count + i, len, result)) {
                result[count] = true;
                return true;
            }
        }
        result[count] = false;
        return false;
    }

    public boolean canJump(int[] nums) {
        Boolean [] result = new Boolean[nums.length];
        return check(nums, 0, nums.length,result);
    }
}
