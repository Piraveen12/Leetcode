class Solution {
    int [][]direction = new int [][] {{1,0},{0,1},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean visited[][]=new boolean [row][col];
        int countiland = 0;
        for(int st =0 ;st < row; st++){
            for(int en =0 ; en < col ; en++){
                if(grid[st][en]==0 || visited[st][en]){
                    continue;
                }
                int count =1;
                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{st,en});
                visited[st][en ]=true;
                while(!q.isEmpty()){
                    int []result = q.poll();
                    int ro= result[0];
                    int co= result[1];
                    for(int[]node :direction ){
                        int nodest= ro+node[0];
                        int colust= co+node[1];
                        if(nodest< 0 || nodest >=row || colust <0|| colust >=col){
                            continue;
                        }
                        if(grid[nodest][colust]==0||visited[nodest][colust]){
                            continue;
                        }
                        count++;
                        q.add(new int[]{nodest,colust});
                        visited[nodest][colust]=true;
                    }
                }
                countiland= Math.max(countiland, count);
            }
        }
        return countiland;
    }
}