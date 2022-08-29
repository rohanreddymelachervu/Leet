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
    public void dfs(List<List<Integer>> result, List<Integer> current, TreeNode root, int target){
        if(root==null) return;
        current.add(root.val);
        if(root.val==target && root.left==null && root.right==null){
            result.add(new ArrayList<>(current));
            current.remove(current.size()-1);
            return;
        }
        dfs(result, current, root.left, target-root.val);
        dfs(result, current, root.right, target-root.val);
        current.remove(current.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        dfs(result, new ArrayList<>(), root, targetSum);
        return result;
    }
}