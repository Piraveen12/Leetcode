class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> ans = new HashMap<>();
    for(int val : nums){
        ans.put(val ,ans.getOrDefault(val,0)+1);
    }
    List<Map.Entry<Integer, Integer>> val = new ArrayList<>(ans.entrySet());
    val.sort(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));
    int[] result = new int [k];
     int st = 0;
     for(Map.Entry<Integer,Integer>ent: val){
        if(st < k){
            result[st] = ent.getKey();
            st++;
        }
     }
     return result;
    }
}