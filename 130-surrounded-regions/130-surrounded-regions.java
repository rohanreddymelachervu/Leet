class Solution {
    private void border(char[][] board,int i,int j,int rows,int cols){
        if(i<0 || i==rows || j<0 || j==cols || board[i][j]!='O'){
            return;
        }
        board[i][j]='T';
        border(board,i-1,j,rows,cols); border(board,i+1,j,rows,cols);
        border(board,i,j+1,rows,cols); border(board,i,j-1,rows,cols); 
    }
    public void solve(char[][] board) {
        int rows=board.length, cols=board[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]=='O' && ((i==0 || i==rows-1) || (j==0 || j==cols-1))){
                    border(board,i,j,rows,cols);
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]=='O') board[i][j]='X';
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]=='T') board[i][j]='O';
            }
        }
    }
}