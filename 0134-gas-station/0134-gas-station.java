class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         int totalgas = 0;
         int costgas = 0;
         int currentgas = 0;
         Queue <Integer> ans=new LinkedList<>();
         int len=gas.length;
         int result=0;       
          for(int st = 0;st<  len ; st++){
            totalgas+=gas[st];
            costgas+=cost[st];
            currentgas+=(gas[st]-cost[st]);
            ans.add(gas[st]-cost[st]);
             while(currentgas<0 && ! ans.isEmpty()){
                currentgas-=ans.poll();
                result++;
                System.out.println(result);
            }  
         }
         if(totalgas>=costgas){
            return result%len;
         }
         return -1;
    }
}