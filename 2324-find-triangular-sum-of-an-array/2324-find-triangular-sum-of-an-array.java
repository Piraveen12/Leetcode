class Solution {
    public int triangularSum(int[] nums) {
    int len = nums.length;
    if(len == 1){
        return nums[0];
    }
    int [][] arr  = new int [len][len];
    for(int [] list : arr){
        Arrays.fill(list , 0);
    }
    for(int i = 0;i<len;i++){
        arr[0][i] = nums[i];
    }
    int row = 1;
    for(int st  = 0;st <len -1;st++){
        for(int en  = 0 ;en<len-st-1;en++){
           int temp = arr[row -1][en] + arr[row-1][en+1];
           if(temp >= 10){
            temp = temp%10;
            arr[row][en]= temp;
           }
           else{
            arr[row][en] = temp;
           }
        }
        row++;
    }
    return arr[len-1][0]%10;
    }
}