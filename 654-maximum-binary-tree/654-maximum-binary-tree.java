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
    private TreeNode constructTree(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int max=Integer.MIN_VALUE, index=0;
        for(int i=left;i<=right;i++) {
            max=Math.max(max,nums[i]);
        }
        for(int i=left;i<=right;i++) {
            if(nums[i]==max) index=i;
        }
        TreeNode root=new TreeNode(max);
        root.left=constructTree(nums,left,index-1);
        root.right=constructTree(nums,index+1,right);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0) return null;
        return constructTree(nums,0,nums.length-1);
    }
}