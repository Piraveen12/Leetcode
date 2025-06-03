class Solution {
    int[][] directions = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
    public int maxAreaOfIsland(int[][] grid) {
    int n = grid.length;
    int max = 0;
    
    int m = grid[0].length;
    boolean [][] arr = new boolean[n][m];
    Queue<int[]> que = new LinkedList<>();
    for(int i =0;i<n;i++){
        for(int j =0 ;j<m;j++){
            if(grid[i][j] == 0 || arr[i][j]){
                continue;
            }
            if(grid[i][j] ==  1){
                que.add(new int[]{i,j});
                int sum =1;
                arr[i][j] =true;
                while(!que.isEmpty()){
                    int[] val = que.poll();
                    int ro = val[0];
                    int co = val[1];
                    for(int[] dir : directions){
                        int row = ro + dir[0];
                        int col = co + dir[1];
                        if(row >= n || col >= m || row <0 || col <0){
                            continue;
                        }
                        if(arr[row][col]|| grid[row][col] == 0 ){
                            continue;
                        }
                        sum++;
                        que.add(new int[]{row,col});
                        arr[row][col] = true;
                    }
                    max= Math.max(sum,max);
                }
            }
        }
      
    }  
    return max;
    }
}