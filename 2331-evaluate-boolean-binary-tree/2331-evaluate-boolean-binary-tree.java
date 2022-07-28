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
    public boolean evaluateTree(TreeNode root) {
        if(root==null) return false;
        boolean left=evaluateTree(root.left);
        boolean right=evaluateTree(root.right);
        boolean res=false;
        if(root.val==2){
            res=left || right;
        }else if(root.val==3){
            res=left && right;
        }else if(root.left==null && root.right==null){
            return (root.val==1) ? true : false;
        }
        return res;
    }
}