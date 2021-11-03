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
    List<String> numbers=new ArrayList();
    public void traverse(TreeNode root,String temp){
        if(root==null) return;
        if(root.left!=null) traverse(root.left,temp+Integer.toString(root.val));
        if(root.right!=null) traverse(root.right,temp+Integer.toString(root.val));
        if(root.right==null && root.left==null){
            numbers.add(temp+Integer.toString(root.val));
            return;
        }
    }
    public int sumNumbers(TreeNode root) {
        int sum=0;
        traverse(root,"");
        for(String s : numbers){
            int num=Integer.parseInt(s);
            sum+=num;
        }
        return sum;
    }
}