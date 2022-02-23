class Solution {
    int GRID_SIZE=9;
    public void solveSudoku(char[][] board) {
        solveBoard(board);
    }
    public boolean isNumberInRow(char[][] board,int row,int number){
        for(int i=0;i<GRID_SIZE;i++){
            if(board[row][i]-'0'==number) return true;
        }
        return false;
    }
    public boolean isNumberInColumn(char[][] board,int column,int number){
        for(int i=0;i<GRID_SIZE;i++){
            if(board[i][column]-'0'==number) return true;
        }
        return false;
    }
    public boolean isNumberInBox(char[][] board,int row,int column,int number){
        int localBoxRow=row-row%3, localBoxColumn=column-column%3;
        for(int i=localBoxRow;i<localBoxRow+3;i++){
            for(int j=localBoxColumn;j<localBoxColumn+3;j++){
                if(board[i][j]-'0'==number) return true;
            }
        }
        return false;
    }
    public boolean isValidPlacement(char[][] board,int row,int column,int number){
        return !isNumberInRow(board,row,number) && !isNumberInColumn(board,column,number) && 
            !isNumberInBox(board,row,column,number);
    }
    public boolean solveBoard(char[][] board){
        for(int i=0;i<GRID_SIZE;i++){
            for(int j=0;j<GRID_SIZE;j++){
                if(board[i][j]=='.'){
                    for(int numberToTry=1;numberToTry<=9;numberToTry++){
                        if(isValidPlacement(board,i,j,numberToTry)){
                            board[i][j]=(char)(numberToTry+'0');
                            if(solveBoard(board)) return true;
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}