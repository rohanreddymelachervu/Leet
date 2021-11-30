class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && DFS(board,word,i,j,0)) return true;
            }
        }
        return false;
    }
    public boolean DFS(char[][]board,String word,int i,int j,int index){
        if(index==word.length()) return true;
        if(i<0 || j <0 || i>=board.length || j>=board[i].length || word.charAt(index)!=board[i][j]) return false;
        char temp=board[i][j];
        board[i][j]=' ';
        boolean found=DFS(board,word,i+1,j,index+1) || DFS(board,word,i-1,j,index+1) || DFS(board,word,i,j+1,index+1) ||
            DFS(board,word,i,j-1,index+1);
        board[i][j]=temp;
        return found;
    }
}