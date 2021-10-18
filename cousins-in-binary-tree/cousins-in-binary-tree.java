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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            boolean f1=false; boolean f2=false;
            for(int i=0;i<n;i++){
                TreeNode temp=q.remove();
                if(temp.val==x) f1=true;
                if(temp.val==y) f2=true;
                if(temp.left!=null && temp.right!=null){
                    if((temp.left.val==x && temp.right.val==y) || (temp.left.val==y && temp.right.val==x)) return false;
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        if(f1==true && f2==true) return true;
        }
        return false;
    }
}