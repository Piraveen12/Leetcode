class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       char[] s1 = text1.toCharArray(); 
       char[] s2 = text2.toCharArray();
       Arrays.sort(s1);
       Arrays.sort(s2);
       int len = s1.length;
       int len1 = s2.length;
       int count= 0;
       for(int i = 0; i<len1 ;i++){
           for(int j = 0;j< len;j++){
            if(s2[i]== s1[j]){
                count++;
                break;
            }
           }
       }
       return count;
    }
}