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
    boolean isBal=true;
    private int dfs(TreeNode root){
        if(root==null) return -1;
        int left=dfs(root.left)+1;
        int right=dfs(root.right)+1;
        if(Math.abs(right-left)>1) isBal=false;
        return Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        int g=dfs(root);
        return isBal;
    }
}