class Solution {
    int [][] direction = new int [][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int findMaxFish(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean [][] visited = new boolean[row][col];
        int maxfish = 0;
        for(int st =0 ;st < row; st++){
            for(int en = 0 ;en < col; en++){
                if(grid[st][en]==0|| visited[st][en]){
                    continue;
                }
                int ans = grid[st][en];
                Queue<int[]> q = new LinkedList<>();
                q.add(new int []{st,en});
                visited[st][en]=true;
                while(!q.isEmpty()){
                    int [] result = q.poll();
                    int ro= result[0];
                    int co = result[1];
                    for(int[] node : direction){
                        int nodest= node[0]+ro;
                        int columst= node[1]+co;
                        if(nodest <0 || nodest>=row || columst< 0 || columst >=col){
                            continue;
                        }
                        if(visited[nodest][columst]){
                            continue;
                        }
                        if(grid[nodest][columst]==0){
                            continue;
                        }
                        ans+=grid[nodest][columst];
                        q.add(new int[]{nodest,columst});
                        visited[nodest][columst]=true;
                    }
                }
                maxfish=Math.max(maxfish,ans);
            }
        }
        return  maxfish;
    }
}