class Solution {
    public int recursion(int [] arr, int [] result ,int n ){
        if(n <= 1){
            return arr[n];
        }
        if(result[n]!=-1){
            return result[n];
        }
        return result[n]=Math.min(recursion(arr,result,n-1)+arr[n], recursion(arr, result, n-2)+arr[n]);
    }
    public int minCostClimbingStairs(int[] arr) {
        int[] ans = new int [arr.length];
        Arrays.fill(ans,-1);
        int st = 0;
        int len = arr.length;
        return Math.min(recursion( arr, ans ,len-1),recursion(arr, ans,len-2));  
    }
}