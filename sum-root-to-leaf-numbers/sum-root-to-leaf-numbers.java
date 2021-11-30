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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        traverse(root,"");
        return sum;
    }
    public void traverse(TreeNode root,String currentSum){
        if(root==null) return;
        if(root.left!=null) traverse(root.left,currentSum+Integer.toString(root.val));
        if(root.right!=null) traverse(root.right,currentSum+Integer.toString(root.val));
        if(root.right==null && root.left==null){
            sum+=Integer.parseInt(currentSum+root.val);
            return;
        }
    }
}