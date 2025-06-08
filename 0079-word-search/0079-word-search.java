class Solution {
    int [][] directions = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public boolean check(char[][] board , int ro,int co,String word,StringBuilder path,boolean[][] visited){
        if (path.toString().equals(word)) return true;

       
        if (ro < 0 || co < 0 || ro >= board.length || co >= board[0].length || visited[ro][co]) {
            return false;
        }
        path.append(board[ro][co]);

        if (!word.startsWith(path.toString())) {
            path.deleteCharAt(path.length() - 1);
            return false;
        }

        visited[ro][co] = true;

        for (int[] dir : directions) {
            int newRow = ro + dir[0];
            int newCol = co + dir[1];

            if (check(board, newRow, newCol, word, path, visited)) {
                return true;
            }
        }

        visited[ro][co] = false;
        path.deleteCharAt(path.length() - 1);
        return false;
    }
    public boolean exist(char[][] board, String word) {
    int row = board.length;
    int col = board[0].length;
    int len = word.length();
    for(int i = 0;i<row;i++){
        for(int j = 0 ;j <col ;j++){
           boolean[][] visited = new boolean[row][col];
            StringBuilder path = new StringBuilder();
            if (check(board, i, j, word, path, visited)) {
                return true;
            }
        }
    }
    return false;
    }
}