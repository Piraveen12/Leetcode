class Solution {
    private void merger(int []nums,int left,int mid,int right){
        int l=left;
        int r=mid+1;
        List <Integer> ans=new ArrayList<>();
        while(l<=mid&&r<=right){
            if(nums[l]<nums[r]){
                ans.add(nums[l++]);
            }
            else{
                ans.add(nums[r++]);
            }
        }
        while(l<=mid){
            ans.add(nums[l++]);
        }
        while(r<=right){
            ans.add(nums[r++]);
        }
        for(int i=left;i<=right;i++){
            nums[i]=ans.get(i-left);
        }
    
    }
    private void mergesort(int []nums,int left,int right){
        if(left>=right){
            return;
        }
        int mid =(left+right)/2;
        mergesort(nums,left,mid);
        mergesort(nums,mid+1,right);
        merger(nums,left,mid,right);
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}