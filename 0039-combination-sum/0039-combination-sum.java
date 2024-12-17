class Solution {
    public void sumof(int i,int[] arr,List<List<Integer>>result,List<Integer>ans,int target,int n){
        if(i==n){
            if(target==0){
                result.add(new ArrayList<>(ans));
            }
            return ;
        }
        if(target<0){
            return ;
        }
        ans.add(arr[i]);
        sumof(i,arr,result,ans,target-arr[i],n);
        ans.remove(ans.size()-1);
        sumof(i+1,arr,result,ans,target,n);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        sumof(0,candidates,result,ans,target,candidates.length);
        return result;
    }
}