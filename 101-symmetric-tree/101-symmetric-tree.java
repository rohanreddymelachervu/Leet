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
    public void check(TreeNode left,TreeNode right){
        if(right==null) return;
        if(!(left.left!=null ^ right.right!=null)) check(left.left,right.right);
        else{
            isSame=false;
            return;
        }
        if(!(left.right!=null ^ right.left!=null)) check(left.right,right.left);
        else{
            isSame=false;
            return;
        }
        if(left.val!=right.val) isSame=false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root.right==null && root.left==null) return true;
        TreeNode temp=root;
        check(root,temp);
        return isSame;
    }
}