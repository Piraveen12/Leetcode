class Solution {
    public int totalFruit(int[] fruits) {
      HashMap<Integer,Integer>arr=new HashMap<>();
      int l=0;
      int n=fruits.length;
      int r=0;
      int max=0;
      while(r<n){
        arr.put(fruits[r],arr.getOrDefault(fruits[r],0)+1);
        if(arr.size()>2){
            arr.put(fruits[l],arr.get(fruits[l])-1);
            if(arr.get(fruits[l])==0){
                arr.remove(fruits[l]);
            }
            l++;
        }
        max=Math.max(max,r-l+1);
        r++;
         
      }
      return max;
    }
}