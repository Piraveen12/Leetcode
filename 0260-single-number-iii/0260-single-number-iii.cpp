class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
     vector<int>result;
     
     for(int i=0;i<nums.size();i++){
         int c=0;
        for(int j=0;j<nums.size();j++){
            if(nums[i]==nums[j]){
                c++;
            }
        }
        if(c==1){
            result.push_back(nums[i]);
            
        }
     }   
     return result;
    }
};