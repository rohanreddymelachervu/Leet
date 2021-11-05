class Trie {
    static class TrieNode{
        boolean endsHere; TrieNode[] child;
        TrieNode(){
            child=new TrieNode[26];
            endsHere=false;
        }
    }
    final private TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child[ch-'a']==null) curr.child[ch-'a']=new TrieNode();
            curr=curr.child[ch-'a'];
        }
        curr.endsHere=true;
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child[ch-'a']==null) return false;
            curr=curr.child[ch-'a'];
        }
        return curr.endsHere;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(curr.child[ch-'a']==null) return false;
            curr=curr.child[ch-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */