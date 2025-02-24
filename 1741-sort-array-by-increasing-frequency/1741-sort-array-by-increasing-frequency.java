class Solution {
    public int[] frequencySort(int[] nums) {
        int length = nums.length;
        int [] arr = new int [length];
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i =0;i<length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }  
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(ans.entrySet());
        list.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        list.sort(Map.Entry.comparingByValue()); 
        int len = list.size();
        int st =0;
        for(int i =0;i<len ;i++){
            int count = list.get(i).getValue();
            for(int j = 0;j < count ; j++){
                arr[st++]=list.get(i).getKey();
            }
        }
        return arr;
    }
}