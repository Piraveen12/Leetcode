class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] arr= new int[256];
       Arrays.fill(arr,-1);
       int l=0;
       int r=0;
       int n=s.length();
       int maxlen=0;
       while(r<n){
        int max=0;
        if(arr[s.charAt(r)]!=-1){
            if(arr[s.charAt(r)]>=l){
                l=arr[s.charAt(r)]+1;
            }
            
        }
        max=r-l+1;
        arr[s.charAt(r)]=r;
        maxlen=Math.max(max,maxlen);
        r++;
       }
       return maxlen;
    }
}