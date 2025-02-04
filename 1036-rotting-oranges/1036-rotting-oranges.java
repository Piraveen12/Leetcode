class Solution {
    int [][] direction = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
       int n = grid.length;
       int m =  grid[0].length;
    
        Queue<int []>q = new LinkedList<>();
        for(int i = 0; i< n;i++){
            for(int j =0; j< m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    grid[i][j]=-1;
                }
            }
        }
        int count =0;
         while(!q.isEmpty()){
            int len = q.size();
            count++;
            for(int i =0;i < len ;i++){
                int[] result = q.poll();
                int ro=result[0];
                int co= result[1];
                for(int[] di: direction){
                    int roindex= ro+di[0];
                    int coindex= co+di[1];
                    if(roindex < 0 || roindex>=n || coindex < 0 || coindex >= m){
                        continue;
                    }
                    if(grid[roindex][coindex]==0){
                        continue;
                    }
                    if(grid[roindex][coindex]==-1){
                        continue;
                    }
                    q.add(new int[]{roindex,coindex});
                    grid[roindex][coindex]=-1;
                }
            }
         }
         int countzero=0;
         for(int i=0;i< n;i++){
            for(int j=0;j< m ;j++){
                if(grid[i][j]==1){
                    return -1;
                }
                if(grid[i][j]==0){
                    countzero++;
                }
            }
         }
         if(countzero == n*m){
            return 0;
         }
         return count-1;
    }
}