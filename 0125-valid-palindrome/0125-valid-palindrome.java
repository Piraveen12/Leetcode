class Solution {
    public boolean isPalindrome(String s) {
        String t=s.toLowerCase();
        int left=0;
        int right=t.length()-1;
        while(left<right){
             
            while(left<right && !(Character.isLetterOrDigit(t.charAt(left)))){
                left++;
            }
            while(left<right && !(Character.isLetterOrDigit(t.charAt(right)))){
                right--;
            }
            if(t.charAt(left)!=t.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}