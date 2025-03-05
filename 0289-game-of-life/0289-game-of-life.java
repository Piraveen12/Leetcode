class Solution {
    private int one(int[][] board, int row ,int col){
        int count = 0;
        if(row > 0 ){
            if(board[row-1][col] == 1 ){
                count++;
            }
            if(col < board[0].length-1){
                if(board[row-1][col+1]==1){
                    count++;
                }
            }
            if(col > 0){
                if(board[row-1][col-1]==1){
                    count++;
                }
            }
        }
        if(col > 0){
            if(board[row][col-1] == 1){
                count++;
            }
        }
        if(col < board[0].length - 1 && board[row][col+1]==1){
            count++;
        }
        if(row < board.length-1){
            if(board[row+1][col] == 1 ){
                count++;
            }
            if(col < board[0].length-1){
                if(board[row+1][col+1]==1){
                    count++;
                }
            }
            if(col > 0){
                if(board[row+1][col-1]==1){
                    count++;
                }
            }
        }
        return count;
    }
     private int zero(int[][] board, int row ,int col){
        int count = 0;
        if(row > 0 ){
            if(board[row-1][col] == 0 ){
                count++;
            }
            if(col < board[0].length-1){
                if(board[row-1][col+1]==0){
                    count++;
                }
            }
            if(col > 0){
                if(board[row-1][col-1]==0){
                    count++;
                }
            }
        }
        if(col > 0){
            if(board[row][col-1] == 0){
                count++;
            }
        }
        if(col < board[0].length - 1 && board[row][col+1]== 0){
            count++;
        }
        if(row < board.length-1){
            if(board[row+1][col] == 0 ){
                count++;
            }
            if(col < board[0].length-1){
                if(board[row+1][col+1]==0){
                    count++;
                }
            }
            if(col > 0){
                if(board[row+1][col-1]==0){
                    count++;
                }
            }
        }
        return count;
    }
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int [][]result = new int[row][col];
        for(int st = 0;st<row;st++){
            for(int en = 0;en < col;en++){
                result[st][en]=board[st][en];
            }
        }
        for(int st = 0; st < row;st++){
            for(int en =0 ;en < col ;en++){
                int onecount = one(result,st,en);
                int zerocount = zero(result,st,en);
                if((st == 1 && en == 0) || (st == 3 && en == 1 ) ){
                    
                    System.out.println(onecount);
                }
                if(board[st][en] == 1){
                    if(onecount < 2){
                        board[st][en] = 0;
                    }
                   else if(onecount >=2 && onecount<= 3){
                        board[st][en] = 1;
                    }
                    else{
                        board[st][en] = 0;
                    }
                }
                else{
                    if(onecount == 3 ){
                        board[st][en] = 1;
                    }
                }
            }
        }
    }
}