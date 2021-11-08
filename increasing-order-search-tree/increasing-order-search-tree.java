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
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> inOrder=new ArrayList();
        inOrderTraversal(root,inOrder);
        return makeTree(inOrder);
    }
    public void inOrderTraversal(TreeNode root,List list){
        if(root==null) return;
        inOrderTraversal(root.left,list);
        list.add(new TreeNode(root.val));
        inOrderTraversal(root.right,list);
    }
    public TreeNode makeTree(List<TreeNode> list){
        TreeNode root=list.get(0);
        TreeNode curr=root;
        if(list.size()>1){
            for(int i=1;i<list.size();i++){
                curr.right=list.get(i);
                curr=curr.right;
            }
        }
        return root;
    }
}