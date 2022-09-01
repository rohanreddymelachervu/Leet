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
    boolean isSame=false;
    private boolean sameTree(TreeNode s, TreeNode t){
        if(s==null || t==null) return s == t;
        return s.val == t.val && sameTree(s.left, t.left) && sameTree(s.right, t.right);
    }
    private void dfs(TreeNode s, TreeNode t){
        if(s==null) return;
        if(s.val == t.val){
            if(isSame) return;
            isSame = sameTree(s, t);
        }
        dfs(s.left, t);
        dfs(s.right, t);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        dfs(root, subRoot);
        return isSame;
    }
}