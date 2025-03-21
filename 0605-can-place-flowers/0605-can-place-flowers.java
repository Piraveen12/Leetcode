class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int count  =0;
       int len = flowerbed.length;
       for(int st = 0;st<len ;st++){
            if(flowerbed[st ]== 0){
                int left = ( st == 0||flowerbed[st-1] == 0) ? 1: 0;
                int right =  (st== len-1||flowerbed[st+1]==0) ? 1:0;
                if(left ==1 && right== 1){
                    flowerbed[st]=1;
                    count++;
                } 
                if(count > n){
                    return true;
                }
            }
           
       } 
       return count>=n;
    }
}