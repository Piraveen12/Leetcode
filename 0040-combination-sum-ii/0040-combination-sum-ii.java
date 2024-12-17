class Solution {
    public void sumof(int i,int []arr,List<List<Integer>>result,List<Integer>ans,int t,int n){
        if(t==0){
            result.add(new ArrayList<>(ans));
            return ;
        }
        if(t<0){
            return;
        }
        for(int j=i;j<n;j++){
            if(j>i && arr[j]==arr[j-1]){
                continue;
            }
            if(arr[j]>t){
                break;
            }
            ans.add(arr[j]);
            sumof(j+1,arr,result,ans,t-arr[j],n);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>>result=new ArrayList<>();
      List<Integer>ans=new ArrayList<>();
      Arrays.sort(candidates);
      sumof(0,candidates,result,ans,target,candidates.length);
      return result;  
    }
}