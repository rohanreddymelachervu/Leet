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
    private TreeNode dfs(TreeNode root){
        if(root==null) return null;
        TreeNode left=dfs(root.left);
        TreeNode right=dfs(root.right);
        if(left!=null){
            left.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        if(right==null && left!=null) return left;
        if(left==null && right==null) return root;
        else return right;
    }
    public void flatten(TreeNode root) {
        root=dfs(root);
    }
}