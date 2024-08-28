class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int []res=new int[n];
        Arrays.fill(res,0);
         
        Deque<Integer>s=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&temp[i]>temp[s.peek()]){
              
               int index = s.pop();
               res[index]=i-index;
            }
            s.push(i);
        }
         
        return res;
        
    }
}