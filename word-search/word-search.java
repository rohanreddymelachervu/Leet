class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && DFS(board,i,j,0,word)) return true; 
            }
        }
        return false;
    }
    public boolean DFS(char[][] board,int i,int j,int index,String word){
        if(word.length()==index) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[i].length || word.charAt(index)!=board[i][j]) return false;
        char temp=board[i][j];
        board[i][j]=' ';
        boolean found=DFS(board,i+1,j,index+1,word) || DFS(board,i-1,j,index+1,word) || DFS(board,i,j+1,index+1,word) || 
            DFS(board,i,j-1,index+1,word);
        board[i][j]=temp;
        return found;
    }
}