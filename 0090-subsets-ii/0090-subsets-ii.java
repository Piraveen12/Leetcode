class Solution {
    public void func(int i,int j,int[] arr,List<List<Integer>>result,List<Integer>ans){
        
        result.add(new ArrayList(ans));
        for(int k=i;k<j;k++){
            if(k>i && arr[k-1]==arr[k]){
                continue;
            }
            ans.add(arr[k]);
            func(k+1,j,arr,result,ans);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums.length,nums,result,ans);
        return result;
    }
}