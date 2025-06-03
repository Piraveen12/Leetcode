class Solution {
    public void com(List<List<Integer>> ans,List<Integer> result, int st ,int k ,int n){
        if(result.size() >k){
            return ;
        }
        if(result.size()== k){
            ans.add(new ArrayList(result));
        }
        for(int i =st ;i <= n ;i++){
            result.add(i);
            com(ans,result,i+1,k,n);
            result.remove(result.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        com(ans,result, 1,k,n);
        return ans;
    }
}