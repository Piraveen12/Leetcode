class Solution {
   int[][] direction = new int[][] { {0, -1}, {-1, 0}, {0, 1}, {1, 0} };

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col  = grid[0].length;
        boolean [][] visitd  = new boolean[row][col];
        int countland=0;
        for(int st = 0 ; st < row ; st++){
            for(int en = 0; en < col; en++ ){
                if(grid[st][en] =='0'||visitd[st][en]){
                    continue;
                }
                countland++;
                Queue<int[] > q= new LinkedList<>();
                q.add(new int[]{st,en});
                visitd[st][en]=true;
                while(!q.isEmpty()){
                    int[] result= q.poll();
                    int rowindex=result[0];
                    int columnindex= result[1];
                    for(int[] node : direction){
                        int nodest= node[0]+rowindex;
                        int nodeend= node[1]+columnindex;
                        if(nodest < 0 || nodest >= row || nodeend < 0 || nodeend >= col){
                            continue;
                        }
                        if(grid[nodest][nodeend]=='0'){
                            continue;
                        }
                        if(visitd[nodest][nodeend]){
                            continue;
                        }
                        q.add(new int [] {nodest,nodeend});
                        visitd[nodest][nodeend]=true;
                    }
                }
            }
        }
        return countland;
    }
}