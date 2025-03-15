class Solution {
    public int[] twoSum(int[] arr, int target) {
        int [] result = new int[2];
        Arrays.fill(result,-1);
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            int sum = arr[st] + arr[end];
            if(sum == target){
                return new int[]{st+1,end+1};
            }
            else if(sum < target){
                st++;
            }
            else{
                end--;
            }
        }
        return result;
    }
}