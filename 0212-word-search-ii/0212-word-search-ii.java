class Solution {
    class Node{
        Node children[] = new Node[26];
        boolean endsHere = false;
        String word = "";
        Node(){
            for(int i=0; i<26; i++){
                children[i]=null;
            }
        }
    }
    public void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endsHere = true;
        curr.word = word;
    }
    public Node root = new Node();
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        for(String word : words){
            insert(word);
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                dfs(board, i, j, root, result);
            }
        }
        return result;
    }
    private void dfs(char[][] board, int i, int j, Node root, List result){
        if(i<0 || j<0 || i==board.length || j==board[0].length) return;
        char c1 = board[i][j];
        int idx = c1-'a';
        if(c1 == '$' || root.children[idx] == null) return;
        root = root.children[idx];
        if(root.endsHere){
            result.add(root.word);
            root.endsHere = false;
        }
        board[i][j] = '$';
        dfs(board, i+1, j, root, result);
        dfs(board, i-1, j, root, result);
        dfs(board, i, j+1, root, result);
        dfs(board, i, j-1, root, result);
        board[i][j] = c1;
    }
}