class Solution {
    public boolean isBipartite(int[][] graph) {
        int N = graph.length;
        int [] colors= new int [N];
        Arrays.fill(colors, -1);
        Queue<Integer>q = new LinkedList<>();
        for(int i =0 ;i< N ;i++){
            if(colors[i]!=-1){
                continue;
            }
            q.add(i);
            colors[i]=1;
            while(!q.isEmpty()){
                int ans = q.poll();
                for(int result : graph[ans]){
                    int col= colors[ans];
                    if(colors[result]!=-1 && col==colors[result]){
                        return false;
                    }
                    if(colors[result] != -1 && colors[result]!= col){
                        continue;
                    }
                    q.add(result);
                    colors[result]= col==1?0:1;
                }
            }
        }
        return  true;
    }
}  