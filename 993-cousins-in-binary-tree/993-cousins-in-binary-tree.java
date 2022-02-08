/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean f1=false, f2=false;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.val==x) f1=true;
                if(curr.val==y) f2=true;
                if(curr.left!=null && curr.right!=null){
                    if((curr.right.val==x && curr.left.val==y) || (curr.left.val==x && curr.right.val==y)) 
                        return false;
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(f1 & f2) return true;
        }
        return false;
    }
}