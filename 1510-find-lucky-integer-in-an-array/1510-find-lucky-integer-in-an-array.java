class Solution {
    public int findLucky(int[] arr) {
    int max  = 0;
    for(int num: arr){
        max= Math.max(max,num);
    }
     int [] freq = new int[max+1];
     for(int i = 0; i < arr.length ; i++)
     {
        freq[arr[i]]++;
     }
     int ans = -1;
     for(int j = 0;j <arr.length; j++){
        if(freq[arr[j]] == arr[j]){
            ans = Math.max(ans,arr[j]);
        }
     }
     return ans;   
    }
}