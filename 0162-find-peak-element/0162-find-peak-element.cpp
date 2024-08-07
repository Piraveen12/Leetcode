class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int max=0;
        int max1=nums[0];
       for(int i=0;i<nums.size();i++){
        if(nums[i]>max1){
            max1=nums[i];
            max=i;
        }
       } 
       return max;
    }
};