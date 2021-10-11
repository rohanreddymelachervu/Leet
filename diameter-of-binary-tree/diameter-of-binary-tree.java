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
    Pair<Integer,Integer> diameterOfBinaryTree_util(TreeNode root){
        if(root==null) return new Pair<>(0,0);
        Pair<Integer,Integer> left=diameterOfBinaryTree_util(root.left);
        Pair<Integer,Integer> right=diameterOfBinaryTree_util(root.right);
        int internal_path=Math.max(left.getValue(),right.getValue());
        if(left.getKey()+right.getKey()+1>internal_path) internal_path=left.getKey()+right.getKey()+1;
        return new Pair<Integer,Integer>(Math.max(left.getKey(),right.getKey())+1,internal_path); 
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Pair<Integer,Integer> result=diameterOfBinaryTree_util(root);
        return Math.max(result.getKey(),result.getValue())-1;
    }
}