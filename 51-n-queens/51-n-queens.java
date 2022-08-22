class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        HashSet<Integer> col = new HashSet<>();
        HashSet<Integer> posDiag = new HashSet<>();
        HashSet<Integer> negDiag = new HashSet<>();
        for(char[] row : board){
            Arrays.fill(row, '.');
        }
        backtrack(result, board, col, posDiag, negDiag, 0, n);
        return result;
    }
    public void backtrack(List<List<String>> result, char[][] board, HashSet<Integer> col, HashSet<Integer> posDiag, HashSet<Integer> negDiag, int row, int n){
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(char[] r : board){
                StringBuilder sb = new StringBuilder();
                for(char ch : r){
                    sb.append(ch);
                }
                temp.add(sb.toString());
            }
            result.add(temp);
            return;
        }
        for(int c=0; c<n; c++){
            if(col.contains(c) || posDiag.contains(c+row) || negDiag.contains(c-row)) 
                continue;
            col.add(c);
            posDiag.add(c+row);
            negDiag.add(c-row);
            board[row][c] = 'Q';
            
            backtrack(result, board, col, posDiag, negDiag, row+1, n);
            
            col.remove(c);
            posDiag.remove(c+row);
            negDiag.remove(c-row);
            board[row][c] = '.';
        }
    }
}