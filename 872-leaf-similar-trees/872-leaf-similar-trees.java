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
    List<Integer> list1=new ArrayList<>();
    List<Integer> list2=new ArrayList<>();
    public void traverse(TreeNode root,List<Integer> list){
        if(root==null) return;
        traverse(root.left,list);
        traverse(root.right,list);
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverse(root1,list1);
        traverse(root2,list2);
        return list1.equals(list2);
    }
}