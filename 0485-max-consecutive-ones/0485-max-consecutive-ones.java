class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
       int l=0;
       int n=arr.length;
       int r=0;
       int max=0;
       while(r<n){
        if(arr[r]!=0&&arr[l]!=0){
            max=Math.max(max,r-l+1);
        }
        else{
            l=r+1;
        }
        r++;
       }
       return max;
    }
}