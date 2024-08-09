class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int index=-1;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.size();i++){
           sum1+=nums[i];
        }
        for(int i=0;i<nums.size();i++){
            sum2+=nums[i];
            if(sum1==sum2){
                index=i;
                break;
            }
            sum1-=nums[i];
        }
        return index;
    }
};