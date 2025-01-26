class Solution {
    public int minsum(int m ,int n ,int[][] arr,int [][]arr1 ){
        if(m==0 && n==0 ){
            return arr1[m][n];
        }
        if(m < 0 || n< 0 ){
            return  Integer.MAX_VALUE;
        }
        if(arr[m][n]!=-1){
            return arr[m][n];
        }
        int first=minsum(m-1,n,arr,arr1);
        int second=minsum(m,n-1,arr,arr1);
         return arr[m][n]=Math.min(first,second)+arr1[m][n];
    }
    public int minPathSum(int[][] grid) {
       int len= grid.length;
       int  len1=grid[0].length;
       int [][] arr =new int[len][len1];
     
       for(int [] arr1 : arr){
        Arrays.fill(arr1,-1);
       }
       return minsum(len-1, len1-1, arr, grid);

    }
}