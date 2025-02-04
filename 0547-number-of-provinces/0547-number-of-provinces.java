class Solution {
 
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int m=isConnected[0].length;
        Queue<Integer> q = new LinkedList<>();
        int count =0;
        int [] arr = new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<n ;i++){
            if(arr[i]==0){
                continue;
            }
            q.add(i);
            count++;
            arr[i]=0;
            while(!q.isEmpty()){
                int ans=q.poll();
                for(int j=0;j< n;j++){
                    if(ans==j){
                        continue;
                    }
                    if(isConnected[ans][j]==0||arr[j]==0){
                        continue;
                    }
                    q.add(j);
                    arr[j]=0;
                }
            }
        }
        return count;
    }
}