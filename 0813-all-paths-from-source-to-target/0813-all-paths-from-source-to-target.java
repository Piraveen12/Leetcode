class Solution {
    public void findpath(int val , int [][] graph,List<Integer> result, List<List<Integer>> ans ,int destination){
        result.add(val);
        if(val == destination){
            ans.add(new ArrayList(result));
            result.remove(result.size()-1);
            return ;
        }
        for(int nei : graph[val]){
            findpath(nei, graph,result,ans, destination);
        }
        result.remove(result.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int len = graph.length;
        int destination = len-1;
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>result = new ArrayList<>();
        findpath(0,graph,result, ans,destination);
        return ans;
    }
}