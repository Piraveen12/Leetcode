class Solution {
    private int check(int [] nums,int size,int count){
        int bc=0;
        int flowercount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=size){
                flowercount++;
            }
            else{
                flowercount=0;
            }
            if(flowercount==count){
                flowercount=0;
                bc++;
            }
        }
        return bc;
    }
    public int minDays(int[] bloomDay, int m, int k) {
         if (bloomDay.length < m * k) {
            return -1;
        }
        int max=bloomDay[0];
        for (int i=0;i<bloomDay.length;i++){
            max=Math.max(bloomDay[i],max);
        }
        int midindex=-1;
        int left=0;
        int right=max;
        while(left<=right){
            int mid=(left+right)/2;
            if(check(bloomDay,mid,k)>=m){
                midindex=mid;
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return midindex;
        
    }
}