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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return constructTree(0, nums.length-1, nums);
    }
    public TreeNode constructTree(int left, int right, int[] nums){
        if(left>right) return null;
        int mid = (left + right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left = constructTree(left, mid-1, nums);
        root.right = constructTree(mid+1, right, nums);
        return root;
    }
}