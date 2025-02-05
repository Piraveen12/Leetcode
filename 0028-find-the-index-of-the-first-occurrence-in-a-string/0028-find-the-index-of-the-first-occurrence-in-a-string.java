class Solution {
    public int strStr(String haystack, String needle) {
        int index=0;
        int len2=needle.length();
        int len1=haystack.length();
        if(len2> len1){
            return -1;
        }
        for (int i = 0; i <= len1 - len2; i++) {  
            if (haystack.substring(i, i + len2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}