/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> bfs=new ArrayDeque<>();
        bfs.add(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            while(size-- >0){
                Node curr = bfs.remove();
                if(size!=0){
                    curr.next=bfs.peek();
                }
                if(curr.left!=null){
                    bfs.add(curr.left);
                }if(curr.right!=null){
                    bfs.add(curr.right);
                }
            }
        }
        return root;
    }
}