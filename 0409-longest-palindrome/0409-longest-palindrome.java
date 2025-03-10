class Solution {
    public int longestPalindrome(String s) {
        int [] arr = new int [128];
        int len = s.length();
        Arrays.fill(arr,0);
        for(int i =0 ;i<len ;i++){
            arr[s.charAt(i)]++;
        }
        boolean hasOdd = false;
        int total = 0;
        for(int i =0;i<128;i++){
              if (arr[i] % 2 == 0) {
                total += arr[i]; 
            } else {
                total += arr[i] - 1;
                hasOdd = true;  
            }
        }
        return hasOdd?total+1:total;
    }
}