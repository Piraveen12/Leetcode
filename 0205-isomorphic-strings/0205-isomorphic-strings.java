import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] result =new int[256];
        int[] result1 =new int[256];
        
        for(int i=0;i<s.length();i++){
            if(result[s.charAt(i)]!=result1[t.charAt(i)]){
                return false;
            }
            result[s.charAt(i)]=i+1;
            result1[t.charAt(i)]=i+1;
        }
        return true;
    }
}