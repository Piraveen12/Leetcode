class Solution {
    public int trap(int[] height) {
     int [] arr=new int [height.length];
     int [] arr1=new int [height.length];
     arr[0]=height[0];
     arr1[height.length-1]=height[height.length-1];
     for(int i=1;i<height.length;i++){
        arr[i] = Math.max(arr[i-1], height[i]);
        
     }
     for(int i=height.length-2;i>=0;i--){
        arr1[i] = Math.max(arr1[i + 1], height[i]);
        
        
     }
     int ans=0;
     for(int i=0;i<height.length;i++){
        int min=Math.min(arr[i],arr1[i]);
        if(height[i]<min){
            ans=ans+(min-height[i]);
        }
     }
     return ans;
    }
}