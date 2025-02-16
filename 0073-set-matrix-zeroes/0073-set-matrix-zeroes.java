class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> roindex = new HashSet<>();
        HashSet<Integer> colindex = new HashSet<>();
        for(int i =0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    roindex.add(i);
                    colindex.add(j);
                }
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(roindex.contains(i) || colindex.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}