class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       int len = strs.length;
       StringBuffer s1 = new StringBuffer(strs[0]);
       StringBuffer s2 = new StringBuffer(strs[len-1]);
       StringBuffer ans = new StringBuffer();
       int strlen =  s1.length();
       for(int i =0;i<strlen; i++){
        if(s1.charAt(i)==s2.charAt(i)){
            ans.append(s1.charAt(i));
        }
        else{
            break;
        }
       }
       return ans.toString(); 
    }
}