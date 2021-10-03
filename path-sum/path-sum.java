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
    boolean hasSum=false;
    public void traverse(TreeNode root,int sum,int targetSum){
        if(root==null) return;
        traverse(root.left,sum+root.val,targetSum);
        traverse(root.right,sum+root.val,targetSum);
        if(root.right==null && root.left==null && sum+root.val==targetSum) hasSum=true;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null && root.val==targetSum) return true;
        if(root.left==null && root.right==null && root.val!=targetSum) return false;
        traverse(root,0,targetSum);
        return hasSum;
    }
}