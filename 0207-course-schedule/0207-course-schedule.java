class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> ans = new ArrayList<>(numCourses);
        for(int st =0;st <numCourses ; st++){
            ans.add(new ArrayList<>());
        }
        for(int [] adj : prerequisites){
            int v= adj[0];
            int u = adj[1];
            ans.get(u).add(v);
        }
        int [] degree = new int[numCourses];
        for(int [] adj : prerequisites){
            int v= adj[0];
            degree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i< numCourses; i++){
            if(degree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr =q.poll();
            for(int v:ans.get(curr) ){
                 
                degree[v]--;
                if(degree[v]==0){

                    q.add(v); 
                }
            }
        }
        for(int i =0 ;i< numCourses;i++){
            if(degree[i]!=0){
                return false;
            }
        }
        return  true;
    }
}