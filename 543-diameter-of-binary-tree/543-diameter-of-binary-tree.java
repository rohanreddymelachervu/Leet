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
    int max=0;
    private int dfs(TreeNode root){
        if(root==null) return -1;
        int left=dfs(root.left)+1;
        int right=dfs(root.right)+1;
        max=Math.max(max,left+right);
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }
}