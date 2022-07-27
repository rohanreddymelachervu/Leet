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
    int result=0;
    private void dfs2(TreeNode root,int maxDepth){
        if(root==null) return;
        if(maxDepth==1 && root.right==null && root.left==null) {
            result+=root.val;
            return;
        }
        dfs2(root.left,maxDepth-1);
        dfs2(root.right,maxDepth-1);
    }
    private int dfs(TreeNode root){
        if(root==null) return 0;
        int left=dfs(root.left)+1;
        int right=dfs(root.right)+1;
        return Math.max(left,right);
    }
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        int maxDepth=dfs(root); 
        dfs2(root,maxDepth);
        return result;
    }
}