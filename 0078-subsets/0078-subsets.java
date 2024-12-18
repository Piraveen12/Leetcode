class Solution {
    public void func(int i,int j,int [] arr,List<List<Integer>>ans,List<Integer>result){
        if(i==j){
            ans.add(new ArrayList(result));
            return ;
        }
        result.add(arr[i]);
        func(i+1,j,arr,ans,result);
        result.remove(result.size()-1);
        func(i+1,j,arr,ans,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>result= new ArrayList<>();
        func(0,nums.length,nums,ans,result);
        return ans;
    }
}