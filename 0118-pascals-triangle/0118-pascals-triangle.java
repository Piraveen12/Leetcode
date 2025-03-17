class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] list = new int[numRows][numRows];
        for(int [] arr : list){
            Arrays.fill(arr , 0);
        }
        list[0][0]=1;
        List<Integer> ans1 = new ArrayList<>();
        ans1.add(1);
        ans.add(new ArrayList<>(ans1));
        for(int  i = 1;i<numRows;i++){
            List<Integer>temp =new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j > 0){
                    list[i][j] = list[i-1][j-1]+ list[i-1][j];
                } 
                else{
                    list[i][j] = list[i-1][j];
                }
                temp.add(list[i][j]);
            }
            ans.add(new ArrayList(temp));
        }
        return ans;
    }
}