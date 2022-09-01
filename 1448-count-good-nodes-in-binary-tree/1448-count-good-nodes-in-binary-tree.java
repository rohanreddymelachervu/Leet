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
    int result=1;
    public void dfs(TreeNode root, int prev){
        if(root==null) return;
        if(root.left!=null){
            if(root.left.val >= prev){
                result++;
                dfs(root.left, root.left.val);
            }
            else
                dfs(root.left, prev);
        }
        if(root.right!=null){
            if(root.right.val >= prev){
                result++;
                dfs(root.right, root.right.val);
            }
            else
                dfs(root.right, prev);
        }
    }
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return result;
    }
}