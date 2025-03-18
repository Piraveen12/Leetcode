class Solution {
    public int findKthLargest(int[] nums, int k) {
     Arrays.sort(nums);
     if(k > nums.length){
        return -1;
     }
     return nums[nums.length-k];   
    }
}