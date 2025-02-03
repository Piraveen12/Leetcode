class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> ans = new ArrayList<>(numCourses);
        for(int i = 0 ;i < numCourses ; i++){
            ans.add(new ArrayList<>());
        }
        for(int []list : prerequisites){
            int v = list[0];
            int u = list[1];
            ans.get(u).add(v);
        }
        int [] degree = new int[numCourses];
        for(int []list : prerequisites){
            degree[list[0]]++;
        }
        int [] arr = new int[numCourses];
        int count=0;
        Queue<Integer>q = new LinkedList<>();
        for(int i =0; i< numCourses;i++){
            if(degree[i]==0){
                q.add(i);
                arr[count]=i;
                count++;
            }
        }
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int val : ans.get(curr)){
                degree[val]--;
                if(degree[val]==0){
                    q.add(val);
                    arr[count++]=val;
                }
            }
        }
        for(int i =0;i<numCourses; i++){
            if(degree[i]!=0){
                return new int[]{};
            }
        }
        return arr;
    }
}