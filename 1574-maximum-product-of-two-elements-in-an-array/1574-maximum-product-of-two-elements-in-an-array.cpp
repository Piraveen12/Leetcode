class Solution {
public:
    int maxProduct(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        int result1=(nums[n-1]-1)*(nums[n-2]-1);
        int result2=(nums[0]-1)*(nums[1]-1);
        return max(result2,result1);
    }
};