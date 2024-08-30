class Solution {
    private int check(int[] nums,int size){
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=Math.ceil((double)nums[i]/size);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        int left=0;
        int right=max;
        while(left<right){
            int mid=(left+right)/2;
            int result=check(piles,mid);
            if(result>h){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}