class Solution {
    private void merger(int le ,int mid  ,int ri ,int [] nums){
        int[] left = new int[mid - le + 1]; 
        int[] right = new int[ri - mid]; 

        for (int i = 0; i < left.length; i++) { 
            left[i] = nums[le + i]; 
        }
        for (int i = 0; i < right.length; i++) { 
            right[i] = nums[mid + 1 + i]; 
        }

        int lst = 0, rst = 0, index = le;
        while (lst < left.length && rst < right.length) { 
            if (left[lst] <= right[rst]) { 
                nums[index++] = left[lst++]; 
            } else { 
                nums[index++] = right[rst++]; 
            }
        }
    
        while (lst < left.length) { 
            nums[index++] = left[lst++]; 
        }
        while (rst < right.length) { 
            nums[index++] = right[rst++]; 
        }
    }
    private void merge(int st,int end,int[] nums){
        if(st< end){
            int mid = (st+end)/2;
            merge(st,mid,nums);
            merge(mid+1,end,nums);
            merger(st,mid,end,nums);
        }
    }
    public int findKthLargest(int[] nums, int k) {
    merge(0,nums.length-1,nums);
     return nums[nums.length-k];   
    }
}