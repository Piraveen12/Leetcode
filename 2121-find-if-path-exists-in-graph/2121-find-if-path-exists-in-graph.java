class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> ans = new ArrayList<>(n);
        for(int i =0;i<n ;i++){
            ans.add(new ArrayList<>());
        }
        for(int[] val: edges){
            int u=val[0];
            int v = val[1];
            ans.get(u).add(v);
            ans.get(v).add(u);
        }
        boolean [] arr  = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        arr[source]=true;
        while(!q.isEmpty()){
            int val = q.poll();
            if(val == destination){
                return  true;
            }
            for(int curr : ans.get(val)){
                if(arr[curr]){
                    continue;
                }
                if(curr == destination){
                    return  true;
                }
                q.add(curr);
                arr[curr]=true;
            }
        } 
        return false;
    }
}