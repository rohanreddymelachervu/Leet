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
    boolean isSame=true;
    public void traverse(TreeNode p,TreeNode q){
        if(p==null && q==null) return;
        if(p==null && q!=null){
            isSame=false; return;
        } if(p!=null && q==null){
            isSame=false; return;
        }
        if(!(p.left!=null ^ q.left!=null)) traverse(p.left,q.left);
        else{
            isSame=false; return;
        }
        if(!(p.right!=null ^ q.right!=null)) traverse(p.right,q.right);
        else{
            isSame=false; return;
        }
        if(p.val!=q.val){
            isSame=false; return;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        traverse(p,q);
        return isSame;
    }
}