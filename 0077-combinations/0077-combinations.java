class Solution {
    public void recursion(int st,int n ,int k,List<List<Integer>>ans,List<Integer> result){
        if(result.size()== k){
            ans.add(new ArrayList(result));
        }
        for(int i=st ; i <= n; i++ ){
            result.add(i);
            recursion(i+1,n,k,ans,result);
            result.remove(result.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans = new ArrayList<>();
        List <Integer>result= new ArrayList<>();
        int st=1;
        recursion(st,n,k,ans,result);
        return ans;
    }
}