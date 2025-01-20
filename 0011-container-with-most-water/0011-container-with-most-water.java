class Solution {
    public int maxArea(int[] height) {
      int left=0;
      int right=height.length-1;
      int ans=0;
      while(left<right){
         int value =(right-left) * Math.min(height[left],height[right]);
         if(value>ans){
            ans=Math.max(ans,value);
         }
         if(height[left]==height[right]){
            left++;
            right--;
         }
         else if(height[left] < height[right]){
            left++;
         }
         else{
            right--;
         }
      }
      return ans; 
    }
}