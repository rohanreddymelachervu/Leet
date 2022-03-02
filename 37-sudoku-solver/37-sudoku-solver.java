class Solution {
    int GRID_SIZE=9;
    public void solveSudoku(char[][] board) {
        solveBoard(board);   
    }
    private boolean isNumberInRow(char[][] board,int number,int row){
        for(int i=0;i<GRID_SIZE;i++){
            if(number==board[row][i]-'0') return true;
        }
        return false;
    }
    private boolean isNumberInColumn(char[][] board,int number,int column){
        for(int i=0;i<GRID_SIZE;i++){
            if(number==board[i][column]-'0') return true;
        }
        return false;
    }
    private boolean isNumberInBox(char[][] board,int number,int row,int column){
        int localBoxRow=row-row%3, localBoxColumn=column-column%3;
        for(int i=localBoxRow;i<localBoxRow+3;i++){
            for(int j=localBoxColumn;j<localBoxColumn+3;j++){
                if(number==board[i][j]-'0') return true;
            }
        }
        return false;
    }
    private boolean isValidPlacement(char[][] board,int number,int row,int column){
        return !isNumberInRow(board,number,row) && !isNumberInColumn(board,number,column)
            && !isNumberInBox(board,number,row,column);
    }
    private boolean solveBoard(char[][] board){
        for(int i=0;i<GRID_SIZE;i++){
            for(int j=0;j<GRID_SIZE;j++){
                if(board[i][j]=='.'){
                    for(int numberToTry=1;numberToTry<=9;numberToTry++){
                        if(isValidPlacement(board,numberToTry,i,j)){
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