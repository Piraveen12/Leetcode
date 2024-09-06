class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int n=nums.length;
      int []res=new int[n+n];
       
       
      Arrays.fill(res,-1);
      for(int i=0;i<n;i++){
        res[i]=nums[i];
        res[i+n]=nums[i];
      }
      int []res1=new int[n];
      Arrays.fill(res1,-1);
      for(int i=0;i<n;i++){
        for(int j=i;j<n+i;j++){
            if(nums[i]<res[j]){
                res1[i]=res[j];
                break;
            }
        }
      }
      return res1;
    
    }
}