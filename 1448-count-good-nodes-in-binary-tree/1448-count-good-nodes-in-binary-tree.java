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
    public int dfs(TreeNode root, int currentMax){
        if(root==null) return 0;
        int count=0;
        if(root.val >= currentMax){
            count++;
            currentMax = root.val;
        }
        count += dfs(root.left, currentMax);
        count += dfs(root.right, currentMax);
        return count;
    }
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
}