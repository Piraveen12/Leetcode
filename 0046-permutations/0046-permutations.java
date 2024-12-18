class Solution {
    public void func(int[] nums,List<List<Integer>>result,List<Integer>ans,boolean  []freq){
        if(ans.size()==nums.length){
            result.add(new ArrayList(ans));
            return ;
        }
        for(int k=0;k<nums.length;k++){
            if(!freq[k]){
                freq[k]=true;
                ans.add(nums[k]);
                func (nums,result,ans,freq);
                ans.remove(ans.size()-1);
                freq[k]=false;
            }
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        func (nums,result,ans,freq);
        return result;
    }
}