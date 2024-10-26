class Solution {
    public int characterReplacement(String s, int k) {
      int maxlen=0;
      int n=s.length();
      for(int i=0;i<n;i++){
      int[] arr=new int[26];
      Arrays.fill(arr,0);
      int max=0;
      for(int j=i;j<n;j++){
        arr[s.charAt(j)-'A']++;
        max=Math.max(max,arr[s.charAt(j)-'A']);
        int changes=(j-i+1)-max;
        if(changes<=k){
            maxlen=Math.max(maxlen,j-i+1);

        }
        else{
            break;
        }
      }
      } 
      return maxlen; 
    }
}