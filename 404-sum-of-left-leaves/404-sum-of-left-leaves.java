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
    private int dfs(TreeNode root, boolean left){
        if(root==null) return 0;
        int sum=0;
        if(root.left==null && root.right==null && left){
            sum += root.val;
        }
        sum += dfs(root.left, true);
        sum += dfs(root.right, false);
        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }
}