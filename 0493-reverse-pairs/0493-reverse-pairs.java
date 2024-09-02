class Solution {
    private int merger(int []nums,int left,int mid,int right){
        int l=left;
        int r=mid+1;
        int pc=0,j=mid+1;
        for(int i=left;i<=mid;i++){
            while(j<=right&&nums[i]>(long)2*nums[j]){
                j++;
            }
            pc=pc+j-(mid+1);
        }
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
    return pc;
    }
    private int mergesort(int []nums,int left,int right){
        if(left<right){
        int count=0;
        int mid =(left+right)/2;
        count+=mergesort(nums,left,mid);
        count+=mergesort(nums,mid+1,right);
        count+=merger(nums,left,mid,right);
        return count;    
        }
        return 0;
    }
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
}