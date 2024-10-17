class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int [] result=new int[256];
        Arrays.fill(result,-1);
        int l=0;
        int r=0;
        int n=s.length();
        int maxlen=0;
        while(r<n){
            if(result[s.charAt(r)]!=-1){
                if(result[s.charAt(r)]>=l){
                    l=result[s.charAt(r)]+1;
                }
            }
            int max=r-l+1;
            maxlen=Math.max(max,maxlen);
            result[s.charAt(r)]=r;
            r++;
        }
        return maxlen;
    }
}