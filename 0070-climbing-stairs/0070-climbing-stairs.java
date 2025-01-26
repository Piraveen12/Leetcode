class Solution {
    public int climb(int [] arr,int n){
        if(n<=2 ){
            return n;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        
        return arr[n]=climb(arr,n-1)+climb(arr,n-2);
    }
    public int climbStairs(int n) {
        int [] arr = new int [n+1];
        Arrays.fill(arr,-1);
        return climb(arr,n);
    }
}