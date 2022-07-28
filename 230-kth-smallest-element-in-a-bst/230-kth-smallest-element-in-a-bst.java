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
    List<Integer> result=new ArrayList<>();
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        int minK=0;
        for(int i=0;i<k;i++){
            minK=result.get(i);
        }
        return minK;
    }
}