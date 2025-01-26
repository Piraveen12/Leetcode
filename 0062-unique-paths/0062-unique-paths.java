class Solution {
    public int path(int m , int [][] arr ,int n){
        if(m==0 && n==0){
            return 1;
        }
       if(m<0 || n<0){
        return 0;
       }
        if(arr [m][n]!=-1){
            return arr[m][n];
        }
        else return arr[m][n]= path(m-1,arr, n)+path(m,arr ,n-1);
        
    }
    public int uniquePaths(int m, int n) {
        int [][]arr =new int[m][n];
        for(int [] arr1 : arr){
            Arrays.fill(arr1,-1);
        }
        return path(m-1,arr,n-1);
    }
}