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
    private void dfs(TreeNode root, List result, List current, int target){
        if(root==null) return;
        current.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val==target){
                result.add(new ArrayList<>(current));
                current.remove(current.size()-1);
                return;
            }
        }
        dfs(root.left, result, current, target-root.val);
        dfs(root.right, result, current, target-root.val);
        current.remove(current.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        dfs(root, result, new ArrayList<>(), targetSum);
        return result;
    }
}