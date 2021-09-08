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
    int minimum=0; 
    public int traverse(TreeNode root){
        if(root==null) return 0;
        int left=0; int right=0;
        if(root.left==null && root.right==null) return 1;
        if(root.left!=null) left=traverse(root.left)+1;
        if(root.right!=null) right=traverse(root.right)+1;
        if(left==0) return right; 
        else if(right==0) return left;
        return Math.min(left,right);
    }
    public int minDepth(TreeNode root) {
        return traverse(root);
     }
}