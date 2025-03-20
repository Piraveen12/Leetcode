class Solution {
   
    private int function(int[][] arr ,int st , int end,int[][]ans){  
        if(st < 0 || end < 0 || arr[st][end] == 1){
            return 0;
        }
        if(st == 0 && end == 0){  
            return 1;
        }
        if(ans[st][end] != -1){
            return ans[st][end];
        }
        return ans[st][end] = function(arr,st-1,end,ans)+function(arr,st,end-1,ans);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int st = obstacleGrid.length-1;
        int end = obstacleGrid[0].length-1;
        int [][] arr = new int[st+1][end+1];
         for (int[] list : arr) {
            Arrays.fill(list, -1);
        }
         return  function(obstacleGrid,st,end,arr);
       
    }
}