class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] list = new int[numRows+1][numRows+1];
        for(int [] arr : list){
            Arrays.fill(arr , 0);
        }
        if(numRows <=0){
            List<Integer>temp1 = new ArrayList<>();
            temp1.add(1);
            return temp1; 
        }
        list[0][0]=1;
        List<Integer> ans1 = new ArrayList<>();
        ans1.add(1);
        ans.add(new ArrayList<>(ans1));
        for(int  i = 1;i<=numRows;i++){
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
        return ans.get(numRows ); 
    }
}