class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        for(int i=0;i<board.size();i++){
            for(int j=0;j<board[i].size();j++){
                if(board[i][j]==word[0] and DFS(board,i,j,0,word)) return true;
            }
        }
        return false;
    }
    bool DFS(vector<vector<char>>& board,int i,int j,int index,string word){
        if(index==word.size()) return true;
        if(i<0 or i>=board.size() or j<0 or j>=board[i].size() or board[i][j]!=word[index]) return false;
        char temp=board[i][j];
        board[i][j]=' ';
        bool found=DFS(board,i+1,j,index+1,word) or DFS(board,i-1,j,index+1,word) or DFS(board,i,j+1,index+1,word) or DFS(board,i,j-1,index+1,word);
        board[i][j]=temp;
        return found;
    }
};