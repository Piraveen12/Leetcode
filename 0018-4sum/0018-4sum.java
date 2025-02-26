class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans =  new ArrayList<>();
        if(len < 4){
            return ans;
        }
        for(int i =0;i < len - 3;i++ ){
            if(i > 0 && nums[i] == nums[ i - 1 ]){
                    continue;
                } 
            for(int j = i+1; j < len-2;j++){
                 if (j > i + 1 && nums[j] == nums[j - 1]) continue;   
                 int left = j+1;
                 int right = len-1;
                 while(left < right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){

                       ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));

                        while(left < right && nums[left] == nums[left+1]){
                            left++;
                        }
                         
                    left++;
                    right--;
                    }
                    else if(sum > target){
                        right--;
                    }
                    else{
                        left++;
                    }
                 }
            }
        }
        return ans;
    }
}